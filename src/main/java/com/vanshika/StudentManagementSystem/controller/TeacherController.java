package com.vanshika.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanshika.StudentManagementSystem.Entity.Course;
import com.vanshika.StudentManagementSystem.Entity.Teacher;
import com.vanshika.StudentManagementSystem.repository.CourseRepository;


@RestController
@RequestMapping("/Teacher")
public class TeacherController {
	
	@Autowired
	private CourseRepository CR;
	
	@GetMapping("/CBT/{teacher}")
	public List<Course> getCoursebyTeachar( @PathVariable("teacher") Teacher teacher){
		return CR.getCoursebyTeacher(teacher);
	}
}
