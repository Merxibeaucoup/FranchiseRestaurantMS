package com.edgar.FranchiseRestaurantsMS.hr.models;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {
//	add employee and roles

	
	public Manager() {
		
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
		return "Waiter [hashCode()=" + hashCode() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getSocialSecurityNumber()=" + getSocialSecurityNumber() + ", getHireDate()=" + getHireDate()
				+ ", getEmployeestatus()=" + getEmployeestatus() + ", toString()=" + super.toString() + ", getId()="
				+ getId() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getGender()="
				+ getGender() + ", getBirthdate()=" + getBirthdate() + ", getAddress()=" + getAddress() + ", getCity()="
				+ getCity() + ", getState()=" + getState() + ", getZipcode()=" + getZipcode() + ", getPhone()="
				+ getPhone() + ", getEmail()=" + getEmail() + ", getPhoto()=" + getPhoto() + ", getClass()="
				+ getClass() + "]";
	}
}
