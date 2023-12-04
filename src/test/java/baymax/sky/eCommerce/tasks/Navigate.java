package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.NavigationBarUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.serenitybdd.screenplay.targets.Target;

public class Navigate {
    public static Performable to(Target targetScreen){
        return Task.where("navigate to the screen", actor -> actor.attemptsTo(
                Click.on(targetScreen)
        ));
    }

    public static Performable toShoppingHomePage() {
        return Task.where("the shopping home page",actor -> actor.attemptsTo(
           Click.on(NavigationBarUI.BROWSER_SHOPPING_HOMEPAGE),
                Switch.toWindowTitled("Active eCommerce | Demo of Active eCommerce CMS")
        ));
    }
}
