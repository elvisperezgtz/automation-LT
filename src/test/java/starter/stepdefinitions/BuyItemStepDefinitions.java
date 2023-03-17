package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.tasks.Add;
import starter.tasks.Finish;
import starter.tasks.Login;
import starter.tasks.NavigateTo;
import starter.user_interfaces.ProductsUI;
import starter.user_interfaces.YourCartUI;
import starter.utils.Convert;

import static starter.user_interfaces.CommonsUI.CHECKOUT_COMPLETE;
import static starter.user_interfaces.OverViewUI.FINISH;
import static starter.utils.GetProperty.fromPropertyFile;

public class BuyItemStepDefinitions {
    @Given("{actor} is logged in at sauce demo")
    public void elvisIsLoggedInAtSauceDemo(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoPage());
        actor.attemptsTo(Login.withHisCredentials(fromPropertyFile("src/test/resources/properties/credentials.properties","username"),
                fromPropertyFile("src/test/resources/properties/credentials.properties","password")));

    }

    @And("{actor} validates items in his shopping cart")
    public void heValidatesItemsInHisShoppingCart(Actor actor) {
        actor.attemptsTo(
                NavigateTo.shoppingCart(),
                Ensure.that(YourCartUI.PRODUCT_NAME).text().isEqualTo(actor.recall("itemName")));
    }

    @When("{actor} wants to buy {string}")
    public void heWantsToBuy(Actor actor, String item) {
        actor.attemptsTo(
                Add.itemToCart(item));
        actor.remember("itemName", ProductsUI.PRODUCT_NAME.of(item).resolveFor(actor).getText());
        System.out.println(actor.recall("itemName").toString());
    }

    @And("{actor} finishes the order with info")
    public void heFinishesTheOrderWithInfo(Actor actor, DataTable personalInformation) {
        actor.attemptsTo(Finish.theOrder(Convert.dataTableToUser(personalInformation)));
        actor.attemptsTo(
                Ensure.that(YourCartUI.PRODUCT_NAME).text().isEqualTo(actor.recall("itemName")));
        actor.attemptsTo(Click.on(FINISH));
    }

    @Then("{actor} should see the {string} page")
    public void heShouldSeeThePage(Actor actor, String expectedMessage) {
        actor.attemptsTo(
                Ensure.that(CHECKOUT_COMPLETE).text().isEqualTo(expectedMessage));
    }
}
