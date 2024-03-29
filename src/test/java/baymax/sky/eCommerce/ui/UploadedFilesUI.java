package baymax.sky.eCommerce.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UploadedFilesUI {
    public static final Target UPLOAD_BTN = Target.the("upload file button").locatedBy("//span[text()='Upload New File']/parent::a");
    public static final Target UPLOAD_AREA = Target.the("upload file").located(By.name("files[]"));
    public static final Target SEARCH_TEXT = Target.the("the search text").locatedBy("//input[@placeholder='Search your files']");
    public static final Target SEARCH_BUTTON = Target.the("search button").locatedBy(("//button[@type='submit']"));
    public static final Target DROPDOWN_FILE_BUTTON = Target.the("dropdown file of {0}").locatedBy("//div[@title='{0}']//preceding-sibling::div[@class='dropdown-file']");
    public static final Target DOWNLOAD_BUTTON = Target.the("download button from {0} file").locatedBy("//a[@download='{0}']");
}
