package com.vanshika.StudentManagementSystem.service;

import java.util.List;

import com.vanshika.StudentManagementSystem.Entity.fees;

public interface feeService {

	public List<fees> getfees();

	public fees updatefee(fees f, Long student);
}
