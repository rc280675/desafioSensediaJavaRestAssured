package context;

public class TestContext {

    private String cardId;
    private String listId; // Adicionado o campo listId

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    // Métodos para listId
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }
}