package com.shoppingcart.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo repo;
	
	/* (non-Javadoc)
	 * @see com.shoppingcart.productservice.service.ProductService#getAllProduct()
	 */
	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) repo.findAll();
	}

	@Override
	public Product getProductByPid(int pid) {
		return  repo.getProductByPid(pid);
	}

}
