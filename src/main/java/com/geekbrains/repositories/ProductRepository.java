package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepository {

    List<Product>productList = List.of(
            new Product(1,"Bread",50),
            new Product(2,"Milk",100),
            new Product(3,"Сhocolate",70),
            new Product(4,"Cola",80),
            new Product(5,"Water",30)
    );

    public Product findOneById(int id) {
        return productList.get(id);
    }

    public List<Product> findAll() {
        return this.productList;
    }

}
