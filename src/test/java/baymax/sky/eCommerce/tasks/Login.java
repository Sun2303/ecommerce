package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.enities.Account;
import baymax.sky.eCommerce.enities.HomePage;
import baymax.sky.eCommerce.ui.LoginUI;
import baymax.sky.eCommerce.ui.NavigationBarUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Login {
    public static Performable asUser(Account account) {
        return Task.where("login as a valid user", actor -> actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Enter.theValue(account.getEmailAddress()).into(LoginUI.EMAIL_FIELD),
                Enter.theValue(account.getPassWord()).into(LoginUI.PWD_FIELD),
                Click.on(LoginUI.LOGIN_BTN)
        ));
    }
    
}
