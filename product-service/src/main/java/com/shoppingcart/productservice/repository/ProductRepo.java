package com.shoppingcart.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shoppingcart.productservice.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	
	 @Query("Select product from Product product where product.pid =:pid")
	 Product getProductByPid(@Param("pid") int pid);
}
