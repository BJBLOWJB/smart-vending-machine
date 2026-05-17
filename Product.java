public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void restock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public boolean purchaseOne() {
        if (quantity > 0) {
            quantity--;
            return true;
        }

        return false;
    }

    public String toString() {
        return id + " - " + name + " ($" + price + ") Quantity: " + quantity;
    }
}
