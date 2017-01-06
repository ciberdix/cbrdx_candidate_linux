package com.ciberdix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id 
	@SequenceGenerator(name="emp_seq",sequenceName="emp_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emp_seq")
	Long Id;
	String firstName;
	String lastName;
	String title;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
