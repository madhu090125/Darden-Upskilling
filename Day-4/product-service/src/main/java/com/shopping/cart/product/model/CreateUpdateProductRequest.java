package com.shopping.cart.product.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateProductRequest {
	
	private String product_name;
	private String product_type;
	private String product_category;
	private double product_price;
	private String product_rating;
	private String product_description;
	private long quantity;
	private String image;

}
