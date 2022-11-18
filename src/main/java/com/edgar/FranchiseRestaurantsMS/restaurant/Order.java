package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OrderId;

	private BigDecimal orderTotalPrice;

	private LocalDateTime orderTime;

	@Column(nullable = false)
	private RestaurantTable table;
	
	
	private Set<Item> items = new HashSet<>();

}
