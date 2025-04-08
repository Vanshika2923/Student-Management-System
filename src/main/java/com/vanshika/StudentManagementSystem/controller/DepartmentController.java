package com.vanshika.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanshika.StudentManagementSystem.Entity.Course;
import com.vanshika.StudentManagementSystem.Entity.Department;
import com.vanshika.StudentManagementSystem.Entity.Student;
import com.vanshika.StudentManagementSystem.Entity.Teacher;
import com.vanshika.StudentManagementSystem.repository.DepartmentRepository;
import com.vanshika.StudentManagementSystem.repository.StudnetRepository;
import com.vanshika.StudentManagementSystem.service.CourseService;
import com.vanshika.StudentManagementSystem.service.DepartmentService;
import com.vanshika.StudentManagementSystem.service.StudentService;
import com.vanshika.StudentManagementSystem.service.TeacherService;


@RestController
@RequestMapping("/HOD")
public class DepartmentController {
	
	@Autowired
	private DepartmentService DS;
	
	@Autowired
	private DepartmentRepository DR;
	@Autowired
	private StudentService SS;
	@Autowired
	private CourseService CS;
	@Autowired
	private TeacherService TS;
	
	@Autowired
	private StudnetRepository SR;
	
	
	
	@GetMapping("/SBD")
	public List<Student> getStudent() {
		return SS.getStudent();
	}
	
	
	@GetMapping("/DBD")
	public List<Department> getDepartment(){
		return DS.getDepartment();
	}
	
	
	
	@GetMapping("/CBD")
	public List<Course> getCourse(){
		return CS.getCourse();
	}
	
	
	

	@GetMapping("/TBD")
	public List<Teacher> getTeacher(){
		return TS.getTeacher();
	}
	
	@GetMapping("/SBD/{department}")
    public List<Student> getStudentbyDepartment( @PathVariable("department")Department department){
    	return SR.getStudentbyDepartment(department);
    	
    }
	

	@GetMapping("/CBD/{department_name}")
    public List<Department> getCoursebyDepartment( @PathVariable("department_name") String department_name){
    	return DR.getCoursebyDepartment(department_name);
    	
    }
	
	

}