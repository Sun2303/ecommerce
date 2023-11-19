package baymax.sky.eCommerce.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Navigate {
    public static Performable to(Target targetScreen){
        return Task.where("navigate to the screen", actor -> actor.attemptsTo(
                Click.on(targetScreen)
        ));
    }
}
