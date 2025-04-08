package com.vanshika.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanshika.StudentManagementSystem.Entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
	
}
