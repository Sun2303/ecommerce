package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NavigationBarUI {
    public static final Target UPLOAD_MENU = Target.the("upload feature").locatedBy("//span[text()='Uploaded Files']/parent::a");
}
