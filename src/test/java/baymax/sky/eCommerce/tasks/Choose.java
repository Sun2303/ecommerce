package baymax.sky.eCommerce.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Choose {
    public static Performable paymentMethod() {
        return Task.where("choose a payment method",actor -> actor.attemptsTo(

        ));
    }
}
