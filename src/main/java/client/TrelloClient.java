package client;

import config.BaseConfig;
import config.ConfigReader;
import io.restassured.response.Response;

public class TrelloClient {

    private final String key = ConfigReader.get("trello.key");
    private final String token = ConfigReader.get("trello.token");

    public Response createCard(String listId, String name) {

        return BaseConfig.request()
                .queryParam("key", key)
                .queryParam("token", token)
                .queryParam("idList", listId)
                .queryParam("name", name)
                .post("/cards");
    }

    public Response moveCard(String cardId, String listId) {

        return BaseConfig.request()
                .queryParam("key", key)
                .queryParam("token", token)
                .queryParam("idList", listId)
                .put("/cards/" + cardId);
    }

    public Response deleteCard(String cardId) {

        return BaseConfig.request()
                .queryParam("key", key)
                .queryParam("token", token)
                .delete("/cards/" + cardId);
    }
}