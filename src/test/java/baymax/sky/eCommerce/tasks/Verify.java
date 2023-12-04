package baymax.sky.eCommerce.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Verify {
    public static Performable theTotal() {
        return Task.where("check the total of the bill", actor -> actor.attemptsTo(

        ));
    }

    public static Performable orderInformation() {
        return Task.where("check the order information", actor -> actor.attemptsTo(

        ));
    }
}
