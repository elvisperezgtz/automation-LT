package starter.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target USERNAME= Target.the("username input box").locatedBy("#user-name");
    public static final Target PASSWORD= Target.the("password input box").locatedBy("#password");
    public static final Target LOGIN= Target.the("Login button").locatedBy("#login-button");
}
