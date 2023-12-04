package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingWebUI {
public static final Target SEARCH_TEXTBOX = Target.the("search button").locatedBy("//input[@data-id='search']");
public static final Target ITEM = Target.the("the {0}").locatedBy("//h2[contains(text(),'{0}')]");
public static final Target EXPECTED_ITEM = Target.the("{0} item").locatedBy("//div[contains(text(),'{0}')]//ancestor::a");
public static final Target ADD_TO_CART_BTN = Target.the("add to cart button").locatedBy("//button[@onclick='addToCart()']");

}
