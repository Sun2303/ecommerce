package baymax.sky.eCommerce.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.io.File;

public class Delay {
    public static Performable inSecond(long timeInSecond) {
        return Task.where("wait for a second", actor -> {
            try {
                Thread.sleep(timeInSecond * 1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });
    }

    /*public static Performable toCheckExistingFile(String filePath) {
        File existingFile = new File(filePath);
        if (existingFile.exists()) {
            System.out.println("File existed");
        } else {
            System.out.println("File not found");
        }
        return null;
    }*/

    public static Performable toCheckExistingFile(String filePath) {
        File existingFile = new File(filePath);
        return Task.where("check the existing file", actor -> {
            if (existingFile.exists()) {
                System.out.println("File existed");
            } else {
                System.out.println("File not found");
            }
        });
    }

}