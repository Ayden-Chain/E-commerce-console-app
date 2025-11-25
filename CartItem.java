package EcommerceApp;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int amount){
        this.quantity += amount;
    }

    public double getTotalPrice(){
        double basePrice = product.getPrice();

        //if product has dicscount, then use the discounted price
        if (product instanceof Discountable) {
            basePrice = ((Discountable) product).getDiscountedPrice();
        }
        return basePrice * quantity;
    }

}

