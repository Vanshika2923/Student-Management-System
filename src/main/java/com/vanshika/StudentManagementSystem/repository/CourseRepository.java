package com.vanshika.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vanshika.StudentManagementSystem.Entity.Course;
import com.vanshika.StudentManagementSystem.Entity.Teacher;
@Repository

public interface CourseRepository  extends JpaRepository<Course,Long> {
	
	@Query("select a FROM Course a WHERE a.teacher =:teacher")
	public List<Course> getCoursebyTeacher(@Param("teacher") Teacher teacher);
}
