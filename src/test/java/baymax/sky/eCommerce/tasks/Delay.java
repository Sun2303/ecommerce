
package baymax.sky.eCommerce.tasks;

import net.serenitybdd.screenplay.Performable;

import java.io.File;

public class Delay {
    public static Performable inSecond(long timeInSecond) {
        System.out.println("step 6");
        try {
            Thread.sleep(timeInSecond * 1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static Performable toCheckExistingFile(String filePath) {
        System.out.println("step 7");
        File existingFile = new File(filePath);
        if (existingFile.exists()) {
            System.out.println("File existed");
        } else {
            System.out.println("File not found");
        }
        return null;
    }
}

