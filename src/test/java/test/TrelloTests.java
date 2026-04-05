package test;

import base.BaseTest;
import org.testng.annotations.Test;
import service.TrelloService;

public class TrelloTests extends BaseTest {
    TrelloService service = new TrelloService();

    @Test
    public void shouldCreateUpdateDeleteCard() {
        String cardId = service.createCard("LIST_ID");
        service.updateCard(cardId);
        service.deleteCard(cardId);
    }
}