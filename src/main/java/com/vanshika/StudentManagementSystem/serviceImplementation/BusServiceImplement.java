package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.Bus;
import com.vanshika.StudentManagementSystem.repository.BusRepository;
import com.vanshika.StudentManagementSystem.service.BusService;

@Service
public class BusServiceImplement implements BusService{

	@Autowired
	BusRepository BS;
	
	public List<Bus> getBus(){
		return BS.findAll();
	}
}
