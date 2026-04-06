package steps;

import io.cucumber.java.en.Then;

public class CommonSteps {

    @Then("operation should be successful")
    public void operationShouldBeSuccessful() {

        System.out.println("Operation executed successfully");
    }
}