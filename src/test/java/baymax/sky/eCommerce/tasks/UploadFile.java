package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.UploadUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;

public class UploadFile {

    public static Performable PDFType(Path filePath) {
        return Task.where("upload a pdf file", actor -> actor.attemptsTo(
                Upload.theFile(filePath).to(UploadUI.UPLOAD_BTN)
        ));
    }
}
