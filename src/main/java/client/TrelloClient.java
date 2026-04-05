package client;


import config.BaseConfig;
import io.restassured.response.Response;
import utils.Environment;

public class TrelloClient {

    public Response createCard(String listId, String name) {

        return BaseConfig.request()
                .queryParam("key", Environment.KEY)
                .queryParam("token", Environment.TOKEN)
                .queryParam("idList", listId)
                .queryParam("name", name)
                .post("/cards");
    }

    public Response updateCard(String cardId, String name) {

        return BaseConfig.request()
                .queryParam("key", Environment.KEY)
                .queryParam("token", Environment.TOKEN)
                .queryParam("name", name)
                .put("/cards/" + cardId);
    }

    public Response deleteCard(String cardId) {

        return BaseConfig.request()
                .queryParam("key", Environment.KEY)
                .queryParam("token", Environment.TOKEN)
                .delete("/cards/" + cardId);
    }

}