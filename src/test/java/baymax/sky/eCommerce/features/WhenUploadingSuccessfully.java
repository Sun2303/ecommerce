package baymax.sky.eCommerce.features;

import baymax.sky.eCommerce.enities.Account;
import baymax.sky.eCommerce.tasks.FileCheck;
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
public class WhenUploadingSuccessfully {
    Actor sun = Actor.named("Sun");
    Account admin = new Account("admin@example.com", "123456");
    //    Path filePath = Paths.get("C:/Users/HP/Desktop/ISTQB Recap/1_7+ISO+Standards.pdf");
    String filePath = "C:/Users/HP/Desktop/ISTQB Recap/1_7+ISO+Standards.pdf";
    String fileName = "1_7+ISO+Standards.pdf";

    @Managed(uniqueSession = true)
    public WebDriver sunDriver;

    @Before
    public void sunCanBrowserTheWeb() {
        sun.can(BrowseTheWeb.with(sunDriver));
    }

    @Test
    public void upload_PDF_file_successfully() {
        sun.attemptsTo(
                Login.asUser(admin),
                FileCheck.upload(filePath),
                FileCheck.download(fileName)
        );
    }
}
