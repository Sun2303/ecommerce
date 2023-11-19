package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NavigationBarUI {
    public static final Target UPLOADED_FILE_BTN = Target.the("upload file button from navigation menu").locatedBy("//span[text()='Uploaded Files']//parent::a");
    public static final Target PRODUCT_BTN = Target.the("product button from navigation menu").locatedBy("//span[text()='Products']//parent::a");
    public static final Target NEW_PRODUCT_BTN = Target.the("add new product screen").locatedBy("//span[text()='Add New product']//parent::a");
}

