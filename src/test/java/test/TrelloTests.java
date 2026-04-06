package test;

import base.BaseTest;
import config.ConfigReader;
import org.testng.annotations.Test;
import service.TrelloService;

public class TrelloTests extends BaseTest {

    TrelloService service = new TrelloService();

    @Test
    public void shouldCreateMoveAndDeleteCard() {

        String listTodo = ConfigReader.get("trello.list.todo");

        String cardId = service.createCard(listTodo);
        service.moveToDoing(cardId);
        service.moveToDone(cardId);
        service.deleteCard(cardId);
    }
}