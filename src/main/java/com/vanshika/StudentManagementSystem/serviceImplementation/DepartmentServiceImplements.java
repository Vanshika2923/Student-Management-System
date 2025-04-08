package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.Department;
import com.vanshika.StudentManagementSystem.repository.DepartmentRepository;
import com.vanshika.StudentManagementSystem.service.DepartmentService;

@Service
public class DepartmentServiceImplements implements DepartmentService {
	
	@Autowired
	DepartmentRepository DS;
	
	public List<Department> getDepartment(){
		return DS.findAll();
	}
	
}