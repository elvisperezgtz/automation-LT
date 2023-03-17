package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static starter.user_interfaces.ProductsUI.ADD_TO_CART;

public class Add {
    public static Performable itemToCart(String item){
        return Task.where("{0} adds an item '"+item+"' to his cart",
                Click.on(ADD_TO_CART.of(item))
                );
    }
}
