package com.shoppingcart.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	//Fetches all the products from the Inventory
	@GetMapping("/getProduct")
	public List<Product> getproductList() {
		return productService.getAllProduct();
	}
	
	//Fetches Product Information for a particular product
	@RequestMapping("/getProductbyPid/{pid}")
	public Product getproductByPid(@PathVariable("pid") int pid){
		try {
				Product product = productService.getProductByPid(pid);
				return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/product")
	public ModelAndView getproductList(Model model) {
		ModelAndView mav = new ModelAndView("productlist");
		mav.addObject("products", productService.getAllProduct());
		return mav;
	}
	 
}
