package com.edgar.FranchiseRestaurantsMS.restaurant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	

	private Integer ItemQuantity;
	
	
	@ManyToOne
	private Product product;
	
	

}
