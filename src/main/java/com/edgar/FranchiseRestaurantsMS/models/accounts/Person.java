package com.edgar.FranchiseRestaurantsMS.models.accounts;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class Person {
	
	
	
	@Column(nullable= false)
	private String fullname;
	
	@Column(nullable= true)
	private String email;
	
	@Column(nullable=true)
	private String phone;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(nullable=false)
	private LocalDate birthday;
	
	public Person() {
		
	}

	public Person(String fullname, String email, String phone, LocalDate birthday) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthday, email, fullname, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(birthday, other.birthday) && Objects.equals(email, other.email)
				&& Objects.equals(fullname, other.fullname) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", email=" + email + ", phone=" + phone + ", birthday=" + birthday
				+ "]";
	}

	

}
