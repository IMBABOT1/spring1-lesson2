package ru.geekbrains.spring1.lesson2.context.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.lesson2.context.entities.Product;
import ru.geekbrains.spring1.lesson2.context.services.ProductService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Componen
@Scope("prototype")
public class Cart {
    private List<Product> products;
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
    }

    public void add(Long id){
        products.add(productService.getProductById(id));
    }

    public void delete(Long id){
        products.remove(productService.getProductById(id));
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }
}
