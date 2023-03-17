package starter.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsUI {
    public static final Target ADD_TO_CART = Target.the("Add the item {0} to cart button")
            .locatedBy("(//div[@class= 'inventory_item_name' and text()='{0}']/following::button)[1]");

    public static final Target PRODUCT_NAME = Target.the("product {0}")
            .locatedBy("//div[@class= 'inventory_item_name' and text()='{0}']");

}
