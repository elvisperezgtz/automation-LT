package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.user_interfaces.LoginUI.*;

public class Login {
    public static Performable withHisCredentials(String username, String password){
        return Task.where("{0} logs in with username '"+username+"'",
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN)
        );
    }
}
