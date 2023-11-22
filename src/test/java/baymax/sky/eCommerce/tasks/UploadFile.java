package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.NavigationBarUI;
import baymax.sky.eCommerce.ui.UploadUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;

public class UploadFile {
    String osName = System.getProperty("os.name");


    public static Performable PDFType(Path filePath) {
        return Task.where("upload a pdf file", actor -> actor.attemptsTo(
                Click.on(NavigationBarUI.UPLOAD_MENU),
                Click.on(UploadUI.UPLOAD_BTN),
                Upload.theFile(filePath).to(UploadUI.FILE_AREA),
                Click.on(UploadUI.BACK_TO_UPLOAD_BTN)
        ));
    }
}
