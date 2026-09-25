class Cart {
    private double[] prices;
    private int itemCount;
    private final String cartId;

    // Constructor
    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        prices = new double[maxItems];
        itemCount = 0;
    }

    // Add an item price
    public void addItem(double price) {
        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        }
    }

    // Calculate total
    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    // Calculate item count
    public int getItemCount() {
        return itemCount;
    }

    // Read-only cart ID
    public String getCartId() {
        return cartId;
    }
}

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total = " + cart.getTotal());
        System.out.println("Item Count = " + cart.getItemCount());
    }
}