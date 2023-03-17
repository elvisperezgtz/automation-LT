package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.models.User;

import static starter.user_interfaces.YourCartUI.CHECKOUT;
import static starter.user_interfaces.YourInformationUI.CONTINUE;

public class Finish {
    public static Performable theOrder(User user) {

        return Task.where("{0} finish the order",
                Click.on(CHECKOUT),
                Fill.theFormCheckout(user),
                Click.on(CONTINUE)
        );
    }
}
