package Codes;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
         Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Tablet", "Electronics")
        };
        System.out.println("Linear Search:");
        Product result1 = LinearSearch.linearSearch(products, "Watch");
        if(result1==null){
            System.out.println("Product Not Found");
        }else{
            System.out.println("Product Found");
            System.out.println(result1);
        }

        Arrays.sort(products,Comparator.comparing(Product::getProductName));
        System.out.println("Binary Search:");
        Product result2 = LinearSearch.linearSearch(products, "Mobile");
        if(result2==null){
            System.out.println("Product Not Found");
        }else{
            System.out.println("Product Found");
            System.out.println(result2);
        }

    }
}
