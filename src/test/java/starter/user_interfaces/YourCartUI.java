package starter.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourCartUI {
    public static final Target PRODUCT_NAME = Target.the("name of the item in cart")
            .locatedBy(".inventory_item_name");

 public static final Target CHECKOUT = Target.the("checkout button")
            .locatedBy("#checkout");

}
