package com.ecom.ecom.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecom.ecom.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
