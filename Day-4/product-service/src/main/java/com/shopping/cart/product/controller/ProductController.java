package com.shopping.cart.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.product.model.CreateUpdateProductRequest;
import com.shopping.cart.product.model.Product;
import com.shopping.cart.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service_product;
	
	@GetMapping("/all")
	public List<Product> getAllTheProducts(){
		return service_product.getAllTheProducts();
		
	}
	
	@PostMapping("/add")
	public Product addNewProduct(@RequestBody Product product) {
		return service_product.addNewProduct(product);
	}
	
	@GetMapping("/id/{product_id}")
	public Optional<Product> getProductById(@PathVariable long product_id) {
		return service_product.getProductById(product_id);
	}
	
	@PutMapping("/update/{product_id}")
	public Product updateNewProduct(@PathVariable long product_id,@RequestBody CreateUpdateProductRequest createUpdateProductRequest) {
		return service_product.updateExistingProduct(product_id,createUpdateProductRequest);	
	}
	
	@DeleteMapping("/delete/{product_id}")
	public String deleteExistingProduct(@PathVariable long product_id) {
		return service_product.deleteExistingProduct(product_id);	
	}

}
