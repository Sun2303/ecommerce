package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NavigationBarUI {
    public static final Target SCREEN = Target.the("{0} from navigation menu").locatedBy("//span[text()='{0}']//parent::a");
    public static final Target BROWSER_SHOPPING_HOMEPAGE = Target.the("browser web button to navigate Shopping home page").locatedBy("//a[@data-title='Browse Website']");

}

