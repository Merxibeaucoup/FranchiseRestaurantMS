package com.edgar.FranchiseRestaurantsMS.hr.models;

import javax.persistence.Entity;

@Entity
public class Receptionist extends Employee {
	
//	creates reservation
	
	
	public Receptionist() {
		
	}

	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chef [hashCode()=" + hashCode() + ", getId()=" + getId() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getHireDate()=" + getHireDate() + ", getEmployeestatus()=" + getEmployeestatus() + ", toString()="
				+ super.toString() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getSocialSecurityNumber()=" + getSocialSecurityNumber() + ", getGender()=" + getGender()
				+ ", getDate()=" + getDate() + ", getAddress()=" + getAddress() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZipcode()=" + getZipcode() + ", getPhone()=" + getPhone()
				+ ", getEmail()=" + getEmail() + ", getPhoto()=" + getPhoto() + ", getClass()=" + getClass() + "]";
	}
}
