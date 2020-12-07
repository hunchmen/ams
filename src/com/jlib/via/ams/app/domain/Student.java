package com.jlib.via.ams.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author albertv
 *
 */

@Entity
@Table(name = "TBL_STUDENT")
public class Student {
	
	@Id
	private int id;
	
	@Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(150)" , nullable = true)
	private String firstName;
	
	@Column(name = "LAST_NAME", columnDefinition = "VARCHAR(150)" , nullable = true)
	private String lastName;
	
	@Column(name = "MIDDLE_NAME", columnDefinition = "VARCHAR(150)" , nullable = true)
	private String middleName;
	
	@Column(name = "AGE", columnDefinition = "NUMERIC(2,0)", nullable = true )
	private int age;
	
	@Column(name = "GENDER", columnDefinition = "VARCHAR(100)" , nullable = true)
	private String gender;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String middleName, int age, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.gender = gender;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
