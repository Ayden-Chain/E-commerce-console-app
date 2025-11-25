package EcommerceApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    // Tambah item ke cart
    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    // Menampilkan isi cart
    public void viewCart() {
        if (items.size() == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n=== Your Cart ===");
        for (CartItem item : items) {
            Product p = item.getProduct();
            System.out.println(p.getName() + " x " + item.getQuantity() + " = Rp " + item.getTotalPrice());
        }
    }

    // Menghitung total keranjang
    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();  // Tidak menghitung ulang
        }
        return total;
    }

    // Clear cart (dipakai saat checkout)
    public void clear() {
        items.clear();
    }

    public double getTotalShipping() {
    double total = 0;

    for (CartItem item : items) {
        Product p = item.getProduct();
        if (p instanceof Shippable) {
            total += ((Shippable) p).getShippingCost() * item.getQuantity();
        }
    }

    return total;
}


}
