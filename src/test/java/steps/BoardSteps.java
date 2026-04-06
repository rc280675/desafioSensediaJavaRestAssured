package steps;

import io.cucumber.java.en.Given;

public class BoardSteps {

    @Given("I have a valid Trello board")
    public void iHaveAValidBoard() {

        // Pode validar board futuramente
        System.out.println("Valid board loaded");
    }
}
