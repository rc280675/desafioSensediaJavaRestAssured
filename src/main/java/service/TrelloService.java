package service;

import client.TrelloClient;
import config.ConfigReader;
import io.restassured.response.Response;
import utils.SchemaValidator;

public class TrelloService {

    private final TrelloClient client = new TrelloClient();

    public String createCard(String listId) {
        // Cria um cartão e obtém a resposta
        Response response = client.createCard(listId, "Card Automação");

        // Verifica se o status da resposta é 200
        response.then().statusCode(200);

        // Valida a resposta com o esquema JSON
        SchemaValidator.validate(response, "createCardSchema.json");

        // Usando jsonPath para obter o ID do cartão
        return response.jsonPath().getString("id");
    }

    public void moveToDoing(String cardId) {
        // Move o cartão para a lista "Doing"
        client.moveCard(cardId, ConfigReader.get("trello.list.doing"))
                .then()
                .statusCode(200);
    }

    public void moveToDone(String cardId) {
        // Move o cartão para a lista "Done"
        client.moveCard(cardId, ConfigReader.get("trello.list.done"))
                .then()
                .statusCode(200);
    }

    public void deleteCard(String cardId) {
        // Exclui o cartão
        client.deleteCard(cardId)
                .then()
                .statusCode(200);
    }
}