package com.edgar.FranchiseRestaurantsMS.hr.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.edgar.FranchiseRestaurantsMS.hr.constants.EmployeeStatus;

@MappedSuperclass
public abstract class Employee extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long employeeId;
	
	@Column(nullable= false)
	@Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$", message="must be exactly 9 numbers ... 3nums - 2nums - 4nums")
	private String socialSecurityNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hireDate;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeestatus;
	
	

	public Employee() {

	}



	public Employee(Long employeeId,
			@Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$", message = "must be exactly 9 numbers ... 3nums - 2nums - 4nums") String socialSecurityNumber,
			LocalDate hireDate, EmployeeStatus employeestatus) {
		super();
		this.employeeId = employeeId;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hireDate = hireDate;
		this.employeestatus = employeestatus;
	}



	public Long getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}



	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}



	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}



	public LocalDate getHireDate() {
		return hireDate;
	}



	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}



	public EmployeeStatus getEmployeestatus() {
		return employeestatus;
	}



	public void setEmployeestatus(EmployeeStatus employeestatus) {
		this.employeestatus = employeestatus;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(employeeId, employeestatus, hireDate, socialSecurityNumber);
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
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId) && employeestatus == other.employeestatus
				&& Objects.equals(hireDate, other.hireDate)
				&& Objects.equals(socialSecurityNumber, other.socialSecurityNumber);
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", socialSecurityNumber=" + socialSecurityNumber + ", hireDate="
				+ hireDate + ", employeestatus=" + employeestatus + "]";
	}

	

}
