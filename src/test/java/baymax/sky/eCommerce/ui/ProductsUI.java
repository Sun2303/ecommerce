package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsUI {

    public static final Target PRODUCT_FIELD = Target.the("product name field").locatedBy("//input[@placeholder='Product Name']");
    public static final Target BRAND_LIST = Target.the("a brand name").locatedBy("//select[@id='brand_id']");
    public static final Target MINIMUM_QTY_FIELD = Target.the("minimum quantity field").locatedBy("//input[@placeholder='Unit (e.g. KG, Pc etc)']");
    public static final Target TAG_FIELD = Target.the("tag field").locatedBy("//input[@placeholder='Type and hit enter to add a tag']");
    public static final Target UNIT_PRICE_FIELD = Target.the("unit price field").locatedBy("//input[@placeholder='Unit price']");
    public static final Target DISCOUNT_FIELD = Target.the("discount field").locatedBy("//input[@placeholder='Discount']");
    public static final Target DISCOUNT_TYPE = Target.the("discount type option").locatedBy("//select[@name='discount_type']");
    public static final Target QTY_FIELD = Target.the("quantity field").locatedBy("//input[@placeholder='Quantity']");
    public static final Target SAVE_AND_PUBLISH_BTN = Target.the("save and publish button").locatedBy("//button[@value='publish']");
}
