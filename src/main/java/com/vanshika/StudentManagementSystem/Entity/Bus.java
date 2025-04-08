package com.vanshika.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bus {

	@Id
	private Long id;
	private String bus_rout;
	@ManyToOne
    @JoinColumn(name = "student", referencedColumnName = "id")
	private Student student;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBus_rout() {
		return bus_rout;
	}
	public void setBus_rout(String bus_rout) {
		this.bus_rout = bus_rout;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [bus_rout=" + bus_rout + ", student=" + student + "]";
	}
	
}
