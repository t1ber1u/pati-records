package com.unicamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.ValidationException;
import javax.ws.rs.WebApplicationException;

@Entity
@Table(name="patient") 
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="genderAdm")
	private String genderAdm;
	
	@Column(name="birthDate")
	private String birthDate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="maritalStatus")
	private String maritalStatus;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="ethnicGroup")
	private String ethnicGroup;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}
	
	public String getGenderAdm() {
		return genderAdm;
	}

	public void setGenderAdm(String genderAdm) {
		this.genderAdm = genderAdm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void validate() throws ValidationException {
		if(this.name == null || this.name.isEmpty())
			throw new ValidationException("O nome do paciente e obrigatorio");
		
		if(this.address == null || this.address.isEmpty())
			throw new ValidationException("O endereco e obrigatorio");
		
		if(this.phone == null || this.phone.isEmpty())
			throw new ValidationException("O telefone e obrigatorio");
		
		if(this.genderAdm == null || this.genderAdm.isEmpty())
			throw new ValidationException("O genero e obrigatorio");
	}
	
}
