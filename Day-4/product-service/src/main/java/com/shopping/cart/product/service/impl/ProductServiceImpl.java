package com.shopping.cart.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.product.model.CreateUpdateProductRequest;
import com.shopping.cart.product.model.Product;
import com.shopping.cart.product.repository.ProductRepository;
import com.shopping.cart.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository_product;

	@Override
	public List<Product> getAllTheProducts() {
		return repository_product.findAll();
	}

	@Override
	public Product addNewProduct(Product product) {
		return repository_product.save(product);
	}

	@Override
	public Optional<Product> getProductById(long product_id) {
		return repository_product.findById(product_id);
	}

	@Override
	public Product updateExistingProduct(long product_id,CreateUpdateProductRequest createUpdateProductRequest) {
		
		Product update_product = new Product(
				product_id,
				createUpdateProductRequest.getProduct_name(),
				createUpdateProductRequest.getProduct_type(),
				createUpdateProductRequest.getProduct_category(),
				createUpdateProductRequest.getProduct_price(),
				createUpdateProductRequest.getProduct_rating(),
				createUpdateProductRequest.getProduct_description(),
				createUpdateProductRequest.getQuantity(),
				createUpdateProductRequest.getImage()
				); 
		
		return repository_product.save(update_product);
	}

	@Override
	public String deleteExistingProduct(long product_id) {
		repository_product.deleteById(product_id);
		return "Product Deleted Successfully";
	}

}
