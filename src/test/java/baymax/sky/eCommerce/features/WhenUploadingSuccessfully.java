package baymax.sky.eCommerce.features;

import baymax.sky.eCommerce.enities.Account;
import baymax.sky.eCommerce.tasks.Login;
import baymax.sky.eCommerce.tasks.File;
import baymax.sky.eCommerce.ui.UploadedFilesUI;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(SerenityRunner.class)
public class WhenUploadingSuccessfully {
    Actor sun = Actor.named("Sun");
    Account admin = new Account("admin@example.com", "123456");
    Path filePath = Paths.get("C:/Users/HP/Desktop/ISTQB Recap/1_7+ISO+Standards.pdf");
    String fileName = "1_7+ISO+Standards.pdf";

    @Managed(uniqueSession = true)
    public WebDriver sunDriver;

    @Before
    public void sunCanBrowserTheWeb() {
        sun.can(BrowseTheWeb.with(sunDriver));
    }

    @Test
    public void upload_PDF_file_successfully() {
        sun.wasAbleTo(
                Login.asUser(admin),
                File.upload(filePath),
                File.download(fileName)
        );
    }
}
