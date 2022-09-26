package ru.geekbrains.spring1.lesson2.context.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.lesson2.context.entities.Product;
import ru.geekbrains.spring1.lesson2.context.repositories.ProductRepository;

import java.util.List;

@Component
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.getProductById(id);
    }

}
