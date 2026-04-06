package steps;

import config.ConfigReader;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import service.TrelloService;

public class CardSteps {

    private final TestContext context;
    private final TrelloService service;

    public CardSteps(TestContext context) {
        this.context = context;
        this.service = new TrelloService();
    }

    @Given("I create a card in To Do")
    public void createCard() {

        String cardId = service.createCard(
                ConfigReader.get("trello.list.todo")
        );

        context.setCardId(cardId);
    }

    @When("I move card to Doing")
    public void moveToDoing() {

        service.moveToDoing(context.getCardId());
    }

    @When("I move card to Done")
    public void moveToDone() {

        service.moveToDone(context.getCardId());
    }

    @Then("I delete the card")
    public void deleteCard() {

        service.deleteCard(context.getCardId());
    }
}