package services;

import models.Order;
import models.Product;

public class OrderService {
    private Order order = new Order();

    public void addProduct(Product product){
        if(product != null){
            order.addProduct(product);
            System.out.println(product.getName() + " added to cart!");
        }
    }

    public void checkout(){
        order.showOrder();
    }
}
