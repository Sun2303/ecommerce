package baymax.sky.eCommerce.features;

import java.io.File;

public class MainCheck {
    public static void main(String[] args) {
        String fileName = "1_7+ISO+Standards.pdf";
        String __fileName = fileName.split("\\.")[0];
        String ___fileName = fileName.split("\\.")[1];
        System.out.println(__fileName);
        System.out.println(___fileName);
        try {
            long timeInSecond = 5;
            Thread.sleep(timeInSecond * 1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


        String filePath = "C:/Users/HP/Desktop/ISTQB Recap/1_7+ISO+Standards.pdf";
        File existingFile = new File(filePath);
        if (existingFile.exists()) {
            System.out.println("File existed");
        } else {
            System.out.println("File not found");
        }
    }
}
