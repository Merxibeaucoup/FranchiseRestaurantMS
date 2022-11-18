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

import com.edgar.FranchiseRestaurantsMS.hr.constants.Gender;

@MappedSuperclass
public abstract class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false)
	private String zipcode;

	@Column(nullable = true)
	@Pattern(regexp = "\\\\d{10}|(?:\\\\d{3}-){2}\\\\d{4}", message = "matches ...1234567890, 123-456-7890")
	private String phone;

	@Column(nullable = true)
	private String email;

	@Column(nullable = true)
	private String photo;

	public Person() {

	}

	public Person(Long id, String firstname, String lastname, Gender gender, LocalDate birthdate, String address,
			String city, String state, String zipcode,
			@Pattern(regexp = "\\\\d{10}|(?:\\\\d{3}-){2}\\\\d{4}", message = "matches ...1234567890, 123-456-7890") String phone,
			String email, String photo) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.email = email;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setDate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, city, birthdate, email, firstname, gender, id, lastname, phone, photo, state, zipcode);
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
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(birthdate, other.birthdate) && Objects.equals(email, other.email)
				&& Objects.equals(firstname, other.firstname) && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(phone, other.phone)
				&& Objects.equals(photo, other.photo)

				&& Objects.equals(state, other.state) && Objects.equals(zipcode, other.zipcode);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", birthdate=" + birthdate + ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + ", phone=" + phone + ", email=" + email + ", photo=" + photo + "]";
	}

}
