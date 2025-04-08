package com.vanshika.StudentManagementSystem.serviceImplementation;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanshika.StudentManagementSystem.Entity.fees;
import com.vanshika.StudentManagementSystem.repository.feeRepository;
import com.vanshika.StudentManagementSystem.service.feeService;

@Service
public class feeServiceImplements implements feeService{

	@Autowired
	feeRepository FS ;
	
	public List<fees> getfees(){
		return FS.findAll();
	}
	
	public fees updatefee(fees f,Long id)
    {

        fees fs = FS.findById(id).get();
        if (Objects.nonNull(f.getStatus())&& !"".equalsIgnoreCase(f.getStatus()))
        { 
        	
            fs.setStatus(f.getStatus());
           
            
        }
 
        return FS.save(fs);
    }
}
