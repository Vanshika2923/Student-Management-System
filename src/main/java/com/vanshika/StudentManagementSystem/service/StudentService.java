package com.vanshika.StudentManagementSystem.service;

import java.util.List;

import com.vanshika.StudentManagementSystem.Entity.Student;

public interface StudentService {
	Student addStudent(Student s);
	
	public List<Student> getStudent();
	
	
}
