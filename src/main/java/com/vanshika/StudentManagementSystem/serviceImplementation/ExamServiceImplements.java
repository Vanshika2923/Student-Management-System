package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vanshika.StudentManagementSystem.Entity.Exam;
import com.vanshika.StudentManagementSystem.repository.ExamRepository;
import com.vanshika.StudentManagementSystem.service.ExamService;

@Service
public class ExamServiceImplements implements ExamService {

	@Autowired
	ExamRepository ES;
	
	public List<Exam> getExam(){
		return ES.findAll();
	}
}
