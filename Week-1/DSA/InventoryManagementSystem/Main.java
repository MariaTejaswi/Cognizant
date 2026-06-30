// package Week-1.DSA.InventoryManagementSystem;
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 55000));
        inventory.addProduct(new Product(102, "Mouse", 50, 600));
        inventory.addProduct(new Product(103, "Keyboard", 30, 1200));

        System.out.println("\nProducts:");
        inventory.displayProducts();

        inventory.updateProduct(102, 70, 650);

        System.out.println("\nAfter Update:");
        inventory.displayProducts();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Delete:");
        inventory.displayProducts();
    }
}
