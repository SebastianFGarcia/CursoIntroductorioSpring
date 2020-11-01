package com.sebastian.uts.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.sebastian.uts.market.domain.Product;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(Integer categoryId);  
    Optional<List<Product>> getScarseProducts(Integer quantity);  
    Optional<Product> getProduct(Integer productId);
    Product save(Product product);
    void delete(Integer productId);
    
}
