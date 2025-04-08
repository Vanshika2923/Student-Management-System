package com.vanshika.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanshika.StudentManagementSystem.Entity.Exam;
import com.vanshika.StudentManagementSystem.Entity.Student;
import com.vanshika.StudentManagementSystem.repository.ExamRepository;
import com.vanshika.StudentManagementSystem.service.ExamService;

@RestController
@RequestMapping("/Result")
public class ExamController {
	
	@Autowired
	ExamService ES;
	
	@Autowired
	ExamRepository ER;

	@GetMapping("/SR")
	public List<Exam> getExam(){
		return ES.getExam();
	}
	
	 @GetMapping("/RBS/{student}")
	 public List<Exam> getResultbyStudent( @PathVariable("student")Student student){
	    return ER.getResultbyStudent(student);
	    	
	 }

}
