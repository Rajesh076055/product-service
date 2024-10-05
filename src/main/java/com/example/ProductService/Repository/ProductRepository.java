package com.example.ProductService.Repository;

import com.example.ProductService.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    public Product findByName(String skuCode);
}
