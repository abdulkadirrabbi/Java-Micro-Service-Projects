package com.kadirprogramming.productservice.repository;

import com.kadirprogramming.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
