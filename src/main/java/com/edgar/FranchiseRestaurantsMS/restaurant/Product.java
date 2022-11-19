package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.math.BigDecimal;
import java.util.Objects;

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
	
	public Product() {
		
	}

	public Product(Long productId, String productName, String productDescription, BigDecimal productPrice,
			Integer stock, boolean isStockRequired) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.stock = stock;
		this.isStockRequired = isStockRequired;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public boolean isStockRequired() {
		return isStockRequired;
	}

	public void setStockRequired(boolean isStockRequired) {
		this.isStockRequired = isStockRequired;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isStockRequired, productDescription, productId, productName, productPrice, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return isStockRequired == other.isStockRequired && Objects.equals(productDescription, other.productDescription)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(productPrice, other.productPrice) && Objects.equals(stock, other.stock);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", stock=" + stock + ", isStockRequired="
				+ isStockRequired + "]";
	}
	
	
}
