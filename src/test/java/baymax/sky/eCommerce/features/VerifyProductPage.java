package baymax.sky.eCommerce.features;

import baymax.sky.eCommerce.enities.Account;
import baymax.sky.eCommerce.enities.ProductInformation;
import baymax.sky.eCommerce.tasks.Create;
import baymax.sky.eCommerce.tasks.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class VerifyProductPage {
    Actor sun = Actor.named("Sun");
    Account admin = new Account("admin@example.com", "123456");
    ProductInformation productInfor = new ProductInformation("Women Clothing & Fashion","Women Clothing & Fashion","Sun Dior Bag","Dior","Pc",100,"SunDior",1000,10,"Percent",5000);
    ProductInformation productInfor02 = new ProductInformation("Women Clothing & Fashion","Women Clothing & Fashion","Sun Dior Bag","Dior","Pc",100,"SunDior",1000,10,"Percent",5000);
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Before
    public void sunCanBrowserTheWeb() {
        sun.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void create_a_new_product_successfully() {
        sun.attemptsTo(
                Login.asUser(admin),
                Create.product(productInfor02)
        );
    }
}
