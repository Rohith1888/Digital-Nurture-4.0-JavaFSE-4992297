package Codes;
public class LinearSearch {

     public static Product linearSearch(Product[] products, String keyName) {
        for (Product product : products) {
            if (product.getProductName().equals(keyName)) {
                return product;
            }
        }
        return null;
    }

}
