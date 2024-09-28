package packagee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductInventory implements Iterable<Product> {
    private List<Product> products;

    // Constructor
    public ProductInventory() {
        products = new ArrayList<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the inventory
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Get the list of products
    public List<Product> getProducts() {
        return products;
    }

    // Implement the iterator method
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}

