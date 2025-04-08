package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.Course;
import com.vanshika.StudentManagementSystem.repository.CourseRepository;
import com.vanshika.StudentManagementSystem.service.CourseService;
@Service
public class CourseServiceImplements implements CourseService {
	
	@Autowired
	CourseRepository CS;
	
	public List<Course> getCourse(){
		return CS.findAll();
	}

}
