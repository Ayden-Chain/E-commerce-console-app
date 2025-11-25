package EcommerceApp;

import java.util.ArrayList;

public class ProductDB {
    public static ArrayList<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<>();
    products.add(new ElectronicProduct(01, "Asus ROG Laptop", 5000000, 24));
    products.add(new ElectronicProduct(02, "KOK Fan 66", 300000, 12));
    products.add(new FashionProduct(20, "Hoodie Alan", 300000, "M", "Cotton"));
    products.add(new FashionProduct(21, "Pants Swag", 200000, "32", "Jeans"));
    products.add(new FoodProduct(120, "Fiesta Nugget", 70000, "23-10-2026"));
    products.add(new FoodProduct(121, "Kanzler Sausage", 55000, "15-02-2027"));

    return products;
    }

}
