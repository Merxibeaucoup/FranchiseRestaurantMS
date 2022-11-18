package com.edgar.FranchiseRestaurantsMS.restaurant;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.edgar.FranchiseRestaurantsMS.hr.constants.TableStatus;

@Entity
public class RestaurantTable {

	@Id
	@Column(nullable = false)
	private Long tableId;

	@Column(nullable = false)
	private Long maxCapacity;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TableStatus tableStatus;
	
	public RestaurantTable() {
		
	}

	public RestaurantTable(Long tableId, Long maxCapacity, TableStatus tableStatus) {
		super();
		this.tableId = tableId;
		this.maxCapacity = maxCapacity;
		this.tableStatus = tableStatus;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public Long getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Long maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public TableStatus getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(TableStatus tableStatus) {
		this.tableStatus = tableStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maxCapacity, tableId, tableStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestaurantTable other = (RestaurantTable) obj;
		return Objects.equals(maxCapacity, other.maxCapacity) && Objects.equals(tableId, other.tableId)
				&& tableStatus == other.tableStatus;
	}

	@Override
	public String toString() {
		return "RestaurantTable [tableId=" + tableId + ", maxCapacity=" + maxCapacity + ", tableStatus=" + tableStatus
				+ "]";
	}
	
	

}
