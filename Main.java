package EcommerceApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Cart cart = new Cart();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Product> products = ProductDB.getProducts();
        int choice;

        do {
            System.out.println("\n====== E-Commerce Console App ======");
            System.out.println("1. Show Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    showProducts(products);
                    break;

                case 2:
                    addToCart(products);
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    checkout();
                    break;

                case 5:
                    System.out.println("Thank you for using this App!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    private static void showProducts(List<Product> products) {
        System.out.println("\n=== Product List ===");

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            System.out.println((i + 1) + ". " + p.getName() +
                    " | Price: Rp " + p.getPrice() +
                    (p instanceof Discountable
                            ? " | After Discount: Rp " + ((Discountable) p).getDiscountedPrice()
                            : "") +
                    (p instanceof Shippable
                            ? " | Shipping: Rp " + ((Shippable) p).getShippingCost()
                            : "")
            );
        }
    }

    private static void addToCart(List<Product> products) {

        showProducts(products);

        System.out.print("Choose product: ");
        int index = scan.nextInt() - 1;

        if (index < 0 || index >= products.size()) {
            System.out.println("Product is not valid!");
            return;
        }

        System.out.print("Quantity: ");
        int qty = scan.nextInt();

        cart.addItem(products.get(index), qty);
        System.out.println("Product Has Been Added!");
    }

    private static void checkout() {
        System.out.println("\n=== CHECKOUT ===");

        cart.viewCart();

        double total = cart.getTotal();
        double shipping = cart.getTotalShipping();
        double finalTotal = total + shipping;

        System.out.println("-------------------------------------");
        System.out.println("Total Purchase : Rp " + total);
        System.out.println("Total Cost  : Rp " + shipping);
        System.out.println("TOTAL Pay   : Rp " + finalTotal);
        System.out.println("-------------------------------------");

        System.out.println("Thankyou for Shopping!");

        cart.clear();
    }
}

