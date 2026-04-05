package service;

import client.TrelloClient;
import io.restassured.response.Response;
import utils.FakerUtils;

public class TrelloService {

    TrelloClient client = new TrelloClient();
    public String createCard(String listId) {
        String cardName = FakerUtils.generateCardName();
        Response response = client.createCard(listId, cardName);
        response.then().statusCode(200);
        return response.jsonPath().getString("id");
    }

    public void updateCard(String cardId) {
        Response response = client.updateCard(cardId, "Card Atualizado");
        response.then().statusCode(200);
    }

    public void deleteCard(String cardId) {
        Response response = client.deleteCard(cardId);
        response.then().statusCode(200);
    }

}
