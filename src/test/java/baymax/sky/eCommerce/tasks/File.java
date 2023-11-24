package baymax.sky.eCommerce.tasks;

import baymax.sky.eCommerce.ui.NavigationBarUI;
import baymax.sky.eCommerce.ui.UploadedFilesUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;

public class File {

    public static Performable upload(Path filePath) {
        return Task.where("upload a file", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.UPLOADED_FILE_BTN),
                Click.on(UploadedFilesUI.UPLOAD_BTN),
                Upload.theFile(filePath).to(UploadedFilesUI.UPLOAD_AREA)
        ));
    }

    public static Performable upload(String filePath) {
        return Task.where("upload a file", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.UPLOADED_FILE_BTN),
                Click.on(UploadedFilesUI.UPLOAD_BTN),
                SendKeys.of(filePath).into(UploadedFilesUI.UPLOAD_AREA)
        ));
    }

    public static Performable download(String fileName) {
        String _fileName = fileName.split("\\.")[0];
        return Task.where("download a file", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.UPLOADED_FILE_BTN),
                Enter.theValue(_fileName).into(UploadedFilesUI.SEARCH_TEXT),
                Click.on(UploadedFilesUI.SEARCH_BUTTON),
                Click.on(UploadedFilesUI.DROPDOWN_FILE_BUTTON.of(fileName)),
                Click.on(UploadedFilesUI.DOWNLOAD_BUTTON.of(fileName))
        ));
    }
    public static Performable download(String fileName, String filePath) {
        String _fileName = fileName.split("\\.")[0];
        return Task.where("download a file", actor -> actor.attemptsTo(
                Navigate.to(NavigationBarUI.UPLOADED_FILE_BTN),
                step2(_fileName),
                step3(),
                step4(fileName),
                step5(fileName),
                Delay.inSecond(5)
                /*delay.toCheckExistingFile(filePath)*/
        ));
    }
    public static Performable step2(String fileName){
        System.out.println("step 2");
        return Enter.theValue(fileName).into(UploadedFilesUI.SEARCH_TEXT);
    }
    public static Performable step3(){
        System.out.println("step 3");
        return Click.on(UploadedFilesUI.SEARCH_BUTTON);
    }
    public static Performable step4(String fileName){
        System.out.println("step 4");
        return Click.on(UploadedFilesUI.DROPDOWN_FILE_BUTTON.of(fileName));
    }
    public static Performable step5(String fileName){
        System.out.println("step 5");
        return Click.on(UploadedFilesUI.DOWNLOAD_BUTTON.of(fileName));
    }
}
