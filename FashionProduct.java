package EcommerceApp;

public class FashionProduct extends Product implements Discountable, Shippable{
    private String size;
    private String material;
    
    public FashionProduct(int id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize(){
        return size;
    }

    public String getMaterial(){
        return material;
    }

    public void displayInfo(){
        System.out.println("Fashion product ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Price : "+ price);
        System.out.println("Size : "+ size);
        System.out.println("Material : "+ material);
    }

    public double getDiscountedPrice(){
        return price * 0.5; //product discounted 50%
    }

    public double getShippingCost(){
        return 35000;
    }

}

