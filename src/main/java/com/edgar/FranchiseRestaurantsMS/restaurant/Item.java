package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.util.Objects;

import javax.persistence.Column;
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

	@Column(name = "QUANTITY")
	private Integer ItemQuantity;

	@ManyToOne
	private Product product;

	@ManyToOne
	private Order order;

	public Item() {

	}

	public Item(Long itemId, Integer itemQuantity, Product product, Order order) {
		super();
		this.itemId = itemId;
		ItemQuantity = itemQuantity;
		this.product = product;
		this.order = order;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Integer getItemQuantity() {
		return ItemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		ItemQuantity = itemQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ItemQuantity, itemId, order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(ItemQuantity, other.ItemQuantity) && Objects.equals(itemId, other.itemId)
				&& Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", ItemQuantity=" + ItemQuantity + ", product=" + product + ", order=" + order
				+ "]";
	}

}
