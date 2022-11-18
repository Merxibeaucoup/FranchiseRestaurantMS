package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(nullable= false)
	private String productName;
	
	
	@Column(columnDefinition = "TEXT")
	private String productDescription;

	@Column(nullable=false)
	private BigDecimal productPrice;
	
	private Integer stock =0;
	
	private boolean isStockRequired = false;
}
