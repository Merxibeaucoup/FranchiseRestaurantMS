package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order  {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OrderId;

	private BigDecimal orderTotalPrice;

	private LocalDateTime orderTime ;

	@Column(nullable = false)
	@ManyToOne
	private RestaurantTable table;

	@OneToMany
	private Set<Item> items = new HashSet<>();
	
	public Order () {
		
	}

	public Order(Long orderId, BigDecimal orderTotalPrice, LocalDateTime orderTime, RestaurantTable table,
			Set<Item> items) {
		super();
		OrderId = orderId;
		this.orderTotalPrice = orderTotalPrice;
		this.orderTime = orderTime;
		this.table = table;
		this.items = items;
	}

	public Long getOrderId() {
		return OrderId;
	}

	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}

	public BigDecimal getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public RestaurantTable getTable() {
		return table;
	}

	public void setTable(RestaurantTable table) {
		this.table = table;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}


	@Override
	public int hashCode() {
		return Objects.hash(OrderId, items, orderTime, orderTotalPrice, table);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(OrderId, other.OrderId) && Objects.equals(items, other.items)
				&& Objects.equals(orderTime, other.orderTime) && Objects.equals(orderTotalPrice, other.orderTotalPrice)
				&& Objects.equals(table, other.table);
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", orderTotalPrice=" + orderTotalPrice + ", orderTime=" + orderTime
				+ ", table=" + table + ", items=" + items + "]";
	}
	
	
	

}
