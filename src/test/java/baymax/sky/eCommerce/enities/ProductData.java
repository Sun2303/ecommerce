package baymax.sky.eCommerce.enities;

import lombok.Getter;

@Getter

public enum ProductData {
    NEW_PRODUCT("Men Clothing & Fashion", "Men Clothing & Fashion", "Sun Men Clothes", "Nike", "Pc", 2, "sunbeos", 500, 10, "Percent", 1000);
    private String productCategory;
    private String homePageCategory;
    private String name;
    private String brand;
    private String unit;
    private int minimumPurchaseQty;
    private String tag;
    private int unitPrice;
    private float discount;
    private String discountType;
    private int quantity;

    ProductData(String productCategory, String homePageCategory, String name, String brand, String unit, int minimumPurchaseQty, String tag, int unitPrice, float discount, String discountType, int quantity) {
        this.productCategory = productCategory;
        this.homePageCategory = homePageCategory;
        this.name = name;
        this.brand = brand;
        this.unit = unit;
        this.minimumPurchaseQty = minimumPurchaseQty;
        this.tag = tag;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.discountType = discountType;
        this.quantity = quantity;
    }
}
