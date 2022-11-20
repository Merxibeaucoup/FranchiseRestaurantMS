package com.edgar.FranchiseRestaurantsMS.hr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.edgar.FranchiseRestaurantsMS.hr.constants.StaffRole;

@Entity
public class Staff extends Employee{
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StaffRole staffRole;
	

	
	public Staff() {
		
	}
	
	

	public StaffRole getStaffRole() {
		return staffRole;
	}



	public void setStaffRole(StaffRole staffRole) {
		this.staffRole = staffRole;
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
		return "Staff [staffRole=" + staffRole + ", getStaffRole()=" + getStaffRole() + ", hashCode()=" + hashCode()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getSocialSecurityNumber()=" + getSocialSecurityNumber()
				+ ", getHireDate()=" + getHireDate() + ", getEmployeestatus()=" + getEmployeestatus() + ", toString()="
				+ super.toString() + ", getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getGender()=" + getGender() + ", getBirthdate()=" + getBirthdate()
				+ ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getZipcode()=" + getZipcode() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail()
				+ ", getPhoto()=" + getPhoto() + ", getClass()=" + getClass() + "]";
	}
	
	

	
	
}
