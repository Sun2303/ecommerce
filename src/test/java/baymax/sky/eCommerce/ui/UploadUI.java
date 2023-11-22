package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UploadUI {
    public static final Target UPLOAD_BTN = Target.the("upload file button").locatedBy("//a[@class='btn btn-primary']");
    public static final Target FILE_AREA = Target.the("the file").locatedBy("//input[@type='file']");
    public static final Target BACK_TO_UPLOAD_BTN = Target.the("back to uploaded fields").locatedBy("//span[text()='Back to uploaded files']/parent::a");
}
