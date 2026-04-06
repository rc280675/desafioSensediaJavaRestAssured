package service;

import client.TrelloClient;
import config.ConfigReader;
import io.restassured.response.Response;
import utils.SchemaValidator;

public class TrelloService {

    private final TrelloClient client = new TrelloClient();

    public String createCard(String listId) {

        Response response = client.createCard(listId, "Card Automação");

        response.then().statusCode(200);

        SchemaValidator.validate(response, "createCardSchema.json");

        return response.jsonPath().getString("id");
    }

    public Response moveToDoing(String cardId) {

        return client.moveCard(
                cardId,
                ConfigReader.get("trello.list.doing")
        );
    }

    public Response moveToDone(String cardId) {

        return client.moveCard(
                cardId,
                ConfigReader.get("trello.list.done")
        );
    }

    public Response deleteCard(String cardId) {

        return client.deleteCard(cardId);
    }

    public Response createCardInvalid(String listId) {

        return client.createCard(listId, "Card inválido");
    }
}