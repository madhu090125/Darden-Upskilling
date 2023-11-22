package com.order.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private String orderId;
	private String productId;
	private String productName;
	private String productDescription;
	private double productPrice;	

}
