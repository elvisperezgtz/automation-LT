package starter.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CommonsUI {
    public static final Target CART= Target.the("shopping cart").locatedBy(".shopping_cart_link");
    public static final Target CHECKOUT_COMPLETE= Target.the("message checkout complete").locatedBy(".title");
}
