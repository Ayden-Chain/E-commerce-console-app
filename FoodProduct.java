package EcommerceApp;

public class FoodProduct extends Product{
    private String expiryDate;

    public FoodProduct(int id, String name, double price, String expiryDate){
    super(id, name, price);
    this.expiryDate = expiryDate;
}

    public String getExpiryDate(){
        return expiryDate;
    }

    public void displayInfo(){
        System.out.println("Fashion product ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Price : "+ price);
        System.out.println("Expiry Date : "+ expiryDate);
    }


    public double getDiscountedPrice(){
        return price * 0.8;
    }


}

