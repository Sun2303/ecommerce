package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.enities.ProductData;
import baymax.sky.eCommerce.enities.ProductInformation;
import baymax.sky.eCommerce.ui.NavigationBarUI;
import baymax.sky.eCommerce.ui.ProductsUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.Keys;

public class Create {
    public static Performable product(ProductInformation productInfor){
        return Task.where("create a new product", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.PRODUCT_BTN),
                Navigate.to(NavigationBarUI.NEW_PRODUCT_BTN),
                Click.on(ProductsUI.PRODUCT_CATEGORY_CHECKBOX.of(productInfor.getProductCategory())),
                Click.on(ProductsUI.HOMEPAGE_CATEGORY_RADIO_BUTTON.of(productInfor.getHomePageCategory())),
                Enter.theValue(productInfor.getName()).into(ProductsUI.PRODUCT_FIELD),
                Select.option(productInfor.getBrand()).from(ProductsUI.BRAND_LIST),
                Enter.theValue(productInfor.getUnit()).into(ProductsUI.UNIT_FIELD),
                Enter.theValue(String.valueOf(productInfor.getMinimumPurchaseQty())).into(ProductsUI.MINIMUM_QTY_FIELD),
                Enter.theValue(productInfor.getTag()).into(ProductsUI.TAG_FIELD).thenHit(Keys.ENTER),
                Enter.theValue(String.valueOf(productInfor.getUnitPrice())).into(ProductsUI.UNIT_PRICE_FIELD),
                Enter.theValue(String.valueOf(productInfor.getDiscount())).into(ProductsUI.DISCOUNT_FIELD),
                Select.option(productInfor.getDiscountType()).from(ProductsUI.DISCOUNT_TYPE),
                Enter.theValue(String.valueOf(productInfor.getQuantity())).into(ProductsUI.QTY_FIELD),
                Click.on(ProductsUI.SAVE_AND_PUBLISH_BTN)
        ));
    }

    public static Performable product(ProductData productData){
        return Task.where("create a new product", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.PRODUCT_BTN),
                Navigate.to(NavigationBarUI.NEW_PRODUCT_BTN),
                Click.on(ProductsUI.PRODUCT_CATEGORY_CHECKBOX.of(productData.getProductCategory())),
                Click.on(ProductsUI.HOMEPAGE_CATEGORY_RADIO_BUTTON.of(productData.getHomePageCategory())),
                Enter.theValue(productData.getName()).into(ProductsUI.PRODUCT_FIELD),
                Select.option(productData.getBrand()).from(ProductsUI.BRAND_LIST),
                Enter.theValue(productData.getUnit()).into(ProductsUI.UNIT_FIELD),
                Enter.theValue(String.valueOf(productData.getMinimumPurchaseQty())).into(ProductsUI.MINIMUM_QTY_FIELD),
                Enter.theValue(productData.getTag()).into(ProductsUI.TAG_FIELD).thenHit(Keys.ENTER),
                Enter.theValue(String.valueOf(productData.getUnitPrice())).into(ProductsUI.UNIT_PRICE_FIELD),
                Enter.theValue(String.valueOf(productData.getDiscount())).into(ProductsUI.DISCOUNT_FIELD),
                Select.option(productData.getDiscountType()).from(ProductsUI.DISCOUNT_TYPE),
                Enter.theValue(String.valueOf(productData.getQuantity())).into(ProductsUI.QTY_FIELD),
                Click.on(ProductsUI.SAVE_AND_PUBLISH_BTN)
        ));
    }
}
