package com.shopping.cart.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shopping.cart.product.model.CreateUpdateProductRequest;
import com.shopping.cart.product.model.Product;

@Service
public interface ProductService{
	
	List<Product> getAllTheProducts();

	Product addNewProduct(Product product);

	Optional<Product> getProductById(long product_id);

	Product updateExistingProduct(long product_id, CreateUpdateProductRequest createUpdateProductRequest);

	String deleteExistingProduct(long product_id);

}
