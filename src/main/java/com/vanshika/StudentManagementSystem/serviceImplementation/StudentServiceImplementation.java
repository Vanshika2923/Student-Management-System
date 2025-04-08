package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.Student;
import com.vanshika.StudentManagementSystem.repository.StudnetRepository;
import com.vanshika.StudentManagementSystem.service.StudentService;
@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudnetRepository Sr ; 
	
	public Student addStudent(Student s) {
		return Sr.save(s);
	}
	
	public List<Student> getStudent(){
		return Sr.findAll();
	}

}
