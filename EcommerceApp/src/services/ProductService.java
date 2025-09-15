package services;

import models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService(){
        products.add(new Product(1,"Laptop",750));
        products.add(new Product(2,"Phone",500));
        products.add(new Product(3,"Headphones",50));
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product getById(int id){
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
