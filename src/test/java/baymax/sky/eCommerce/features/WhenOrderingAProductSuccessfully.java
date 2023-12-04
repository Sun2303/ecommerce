package baymax.sky.eCommerce.features;

import baymax.sky.eCommerce.enities.Role;
import baymax.sky.eCommerce.tasks.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenOrderingAProductSuccessfully {
    Actor sun = Actor.named("Sun");

    @Managed(uniqueSession = true)
    public WebDriver sunDriver;

    @Before
    public void sunCanBrowserTheWeb() {
        sun.can(BrowseTheWeb.with(sunDriver));
    }

    @Test
    public void upload_PDF_file_successfully() {
        sun.attemptsTo(
                Login.asCustomer(),
                Order.item("K710 Wireless Keyboard","Razer Wolverine V2"),
                Verify.theTotal(),
                Choose.paymentMethod(),
                Verify.orderInformation()
        );
    }
}
