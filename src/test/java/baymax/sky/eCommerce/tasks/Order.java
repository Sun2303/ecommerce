package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.ShoppingWebUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Order {
    public static Performable item(String... itemName) {
        return Task.where("item name", actor -> actor.attemptsTo(
                Enter.theValue(itemName).into(ShoppingWebUI.SEARCH_TEXTBOX),
                Click.on(ShoppingWebUI.EXPECTED_ITEM.of(itemName)),
                Ensure.that(ShoppingWebUI.ITEM.of(itemName)).isDisplayed(),
                Click.on(ShoppingWebUI.ADD_TO_CART_BTN)
//                HoverOverTarget.over(ShoppingWebUI.ITEM).then(Click.on(ShoppingWebUI.ADD_TO_CART_BTN))
        ));
    }
}
