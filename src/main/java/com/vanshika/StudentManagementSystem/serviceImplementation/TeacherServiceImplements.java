package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.Teacher;
import com.vanshika.StudentManagementSystem.repository.TeacherRepository;
import com.vanshika.StudentManagementSystem.service.TeacherService;

@Service
public class TeacherServiceImplements implements TeacherService{
	
	@Autowired
	TeacherRepository TS;
	
	public List<Teacher> getTeacher(){
		return TS.findAll();
	}
}
