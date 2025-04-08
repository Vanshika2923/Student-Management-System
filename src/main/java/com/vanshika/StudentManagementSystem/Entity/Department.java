package com.vanshika.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity

public class Department {

	@Id
	private Long id;
	private String department_name;
	private String Head_of_department;
	@ManyToOne
    @JoinColumn(name = "course", referencedColumnName = "id")
	private Course course;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getHead_of_department() {
		return Head_of_department;
	}
	public void setHead_of_department(String head_of_department) {
		Head_of_department = head_of_department;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [ department_name=" + department_name + ", Head_of_department="
				+ Head_of_department + ", course=" + course + "]";
	}
	
	
}
