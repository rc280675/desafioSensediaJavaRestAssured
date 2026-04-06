package steps;

import config.ConfigReader;
import context.TestContext;
import io.cucumber.java.en.Given;

public class ListSteps {

    private final TestContext context;

    public ListSteps(TestContext context) {
        this.context = context;
    }

    @Given("I use To Do list")
    public void useTodoList() {

        String listId = ConfigReader.get("trello.list.todo");
        context.setListId(listId);
    }
}