package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.models.User;

import static starter.user_interfaces.YourInformationUI.*;

public class Fill {
    public static Performable theFormCheckout(User user){
        return Task.where("{0} fills the form with his personal information",
                Enter.theValue(user.getFirstName()).into(FIRST_NAME),
                Enter.theValue(user.getLastName()).into(LAST_NAME),
                Enter.theValue(user.getPostalCode()).into(POSTAL_CODE)
        );
    }
}
