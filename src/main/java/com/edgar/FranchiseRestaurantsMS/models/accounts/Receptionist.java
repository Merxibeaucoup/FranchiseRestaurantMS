package com.edgar.FranchiseRestaurantsMS.models.accounts;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Receptionist extends Employee {
//	Creates Reservation
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Account account;
	
	public Receptionist() {
		
	}

	public Receptionist(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(account);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receptionist other = (Receptionist) obj;
		return Objects.equals(account, other.account);
	}

	@Override
	public String toString() {
		return "Receptionist [account=" + account + "]";
	}
	
	

}
