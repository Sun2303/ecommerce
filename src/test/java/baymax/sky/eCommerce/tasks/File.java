package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.NavigationBarUI;
import baymax.sky.eCommerce.ui.UploadedFilesUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;

public class File {

    public static Performable upload(Path filePath) {
        return Task.where("upload a file", actor -> actor.attemptsTo(
                Click.on(NavigationBarUI.UPLOAD_MENU),
                Click.on(UploadedFilesUI.UPLOAD_BTN),
                Upload.theFile(filePath).to(UploadedFilesUI.UPLOAD_AREA)
        ));
    }

    public static Performable download(String fileName) {
        return Task.where("download a file", actor -> actor.attemptsTo(
                Click.on(NavigationBarUI.UPLOAD_MENU),
                /*Enter.theValue(fileName).into(UploadedFilesUI.SEARCH_TEXT.of(fileName.split(".",3))),*/
                Click.on(UploadedFilesUI.SEARCH_BUTTON),
                Click.on(UploadedFilesUI.DROPDOWN_FILE_BUTTON.of(fileName)),
                Click.on(UploadedFilesUI.DOWNLOAD_BUTTON.of(fileName))
        ));
    }
}
