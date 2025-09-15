package models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product){
        items.add(product);
    }

    public double getTotal(){
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void showOrder(){
        System.out.println("Your Order:");
        for(Product p : items){
            System.out.println(" - " + p);
        }
        System.out.println("Total: $" + getTotal());
    }
}
