package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import starter.pages.SauceDemoHomePage;
import starter.user_interfaces.CommonsUI;

import static starter.user_interfaces.CommonsUI.CART;

public class NavigateTo {
    public static Performable theSauceDemoPage() {
        return Task.where("{0} opens the Sauce demo home page",
                Open.browserOn().the(SauceDemoHomePage.class));
    }

    public static Performable shoppingCart(){
        return Task.where("{0} opens the shopping cart",
                Click.on(CART));
    }
}
