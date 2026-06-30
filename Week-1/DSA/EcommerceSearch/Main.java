// package Week-1.DSA.EcommerceSearch;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");

        Product p1 = Search.linearSearch(products, 104);

        if (p1 != null)
            System.out.println(p1);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        Product p2 = Search.binarySearch(products, 104);

        if (p2 != null)
            System.out.println(p2);
        else
            System.out.println("Product not found");

    }
}