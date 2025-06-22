package Codes;
public class BinarySearch {

    public static Product binarySearch(Product[] products, String keyName) {
        int start = 0, end = products.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(keyName.equals(products[mid].getProductName())){
                return products[mid];
            }
            else if(keyName.compareTo(products[mid].getProductName())<0){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return null;
    }
}

