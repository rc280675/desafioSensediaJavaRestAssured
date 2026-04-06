package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import service.TrelloService;

import static org.hamcrest.Matchers.equalTo;

public class CardSteps {

    private final TestContext context;
    private final TrelloService service;

    public CardSteps(TestContext context) {
        this.context = context;
        this.service = new TrelloService();
    }

    @When("I try to create card with invalid list")
    public void createInvalidCard() {

        context.setResponse(
                service.createCardInvalid("invalid_list")
        );
    }

    @When("I delete invalid card")
    public void deleteInvalidCard() {

        context.setResponse(
                service.deleteCard("invalid_card")
        );
    }

    @When("I move invalid card")
    public void moveInvalidCard() {

        context.setResponse(
                service.moveToDoing("invalid_card")
        );
    }

    @Then("I should receive bad request")
    public void validateBadRequest() {

        context.getResponse()
                .then()
                .statusCode(400);
    }

    @Then("I should receive not found")
    public void validateNotFound() {

        context.getResponse()
                .then()
                .statusCode(404);
    }
}