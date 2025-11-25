package EcommerceApp;

public class ElectronicProduct extends Product implements Discountable, Shippable{
    private int warrantyMonths;

    public ElectronicProduct(int id, String name, double price, int warrantyMonths){
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths(){
        return warrantyMonths;
    }

    public void displayInfo(){
         System.out.println("Electronics ID : "+ id);
         System.out.println("Name : "+name);
         System.out.println("Price : "+ price);
         System.out.println("Warranty : "+ warrantyMonths);
    }

    public double getDiscountedPrice(){
        return price * 0.4; // Example discounted 60%
    }

    public double getShippingCost(){
        return 50000;
    }
}

