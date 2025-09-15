import models.Product;
import services.ProductService;
import services.OrderService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nAvailable Products:");
            for(Product p : productService.getProducts()){
                System.out.println(p);
            }
            System.out.println("Enter Product ID to add to cart, 0 to Checkout: ");
            int choice = sc.nextInt();

            if(choice == 0){
                orderService.checkout();
                break;
            } else {
                Product product = productService.getById(choice);
                orderService.addProduct(product);
            }
        }
    }
}
