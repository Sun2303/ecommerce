package baymax.sky.eCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target EMAIL_FIELD = Target.the("email field").locatedBy("//input[@id='email']");
    public static final Target PWD_FIELD = Target.the("password field").locatedBy("//input[@id='password']");
    public static final Target LOGIN_BTN = Target.the("login button").locatedBy("//button[@type='submit']");
    public static final Target LOGIN_CUSTOMER_ACCOUNT = Target.the("login button ").locatedBy("//button[@class='btn btn-primary btn-block fw-700 fs-14 rounded-4']");
    public static final Target COPY_CREDENTIALS_BTN = Target.the("copy credentials button").locatedBy("//button[text()='Copy credentials']");

}
