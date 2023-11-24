package baymax.sky.eCommerce.enities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProductInformation {
    private String name;
    private String brand;
    private String unit;
    private int minimumPurchaseQty;
    private String tag;
    private String unitPrice;
    private float discount;
    private String discountType;
    private int quantity;

}
