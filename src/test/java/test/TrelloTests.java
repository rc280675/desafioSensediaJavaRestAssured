package test;

import base.BaseTest;
import config.ConfigReader;
import org.testng.annotations.Test;
import service.TrelloService;

public class TrelloTests extends BaseTest {

    TrelloService service = new TrelloService();

    @Test
    public void shouldCreateUpdateDeleteCard() {

        String listId = ConfigReader.get("trello.list.todo");

        String cardId = service.createCard(listId);
        service.updateCard(cardId);
        service.deleteCard(cardId);
    }
}