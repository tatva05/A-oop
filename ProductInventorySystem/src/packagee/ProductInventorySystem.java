package packagee;
import java.util.Collections;

public class ProductInventorySystem {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product("Laptop", 1200.0, 10);
        Product p2 = new Product("Smartphone", 800.0, 20);
        Product p3 = new Product("Tablet", 500.0, 15);

        // Clone a product
        Product p4 = p1.clone();
        p4.setName("Laptop Clone");

        // Create product inventory
        ProductInventory inventory = new ProductInventory();
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        // Display all products
        System.out.println("All Products:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Sort by price using Comparable
        Collections.sort(inventory.getProducts());
        System.out.println("\nProducts sorted by price:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Sort by name using Comparator
        inventory.getProducts().sort(new ProductComparator());
        System.out.println("\nProducts sorted by name:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}
