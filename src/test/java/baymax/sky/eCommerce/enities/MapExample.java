package baymax.sky.eCommerce.enities;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> colors = new HashMap<>();
        colors.put("ABC","1122");
        colors.put("MNB","3344");
        System.out.println(colors.get("ABC"));
    }
}
