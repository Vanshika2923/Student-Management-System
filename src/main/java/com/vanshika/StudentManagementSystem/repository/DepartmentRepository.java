package com.vanshika.StudentManagementSystem.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vanshika.StudentManagementSystem.Entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	
	@Query("select a FROM Department a WHERE a.department_name =:department_name")
	public List<Department> getCoursebyDepartment(@Param("department_name") String department_name);
}


