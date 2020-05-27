package com.shoppingcart.productservice.service;

import java.util.List;

import com.shoppingcart.productservice.model.Product;

public interface ProductService {

	List<Product> getAllProduct();
	
	Product getProductByPid(int Pid);

}