import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Product> products;

    public VendingMachine() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public Product findProduct(String id) {
        return products.get(id);
    }

    public boolean buyProduct(String id) {
        Product product = findProduct(id);

        if (product == null) {
            return false;
        }

        return product.purchaseOne();
    }

    public boolean restockProduct(String id, int amount) {
        Product product = findProduct(id);

        if (product == null || amount <= 0) {
            return false;
        }

        product.restock(amount);
        return true;
    }
}
