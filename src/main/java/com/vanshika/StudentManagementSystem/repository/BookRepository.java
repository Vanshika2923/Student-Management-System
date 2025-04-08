package com.vanshika.StudentManagementSystem.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vanshika.StudentManagementSystem.Entity.Books;
import com.vanshika.StudentManagementSystem.Entity.Student;



@Repository
public interface BookRepository extends JpaRepository<Books,Long> {

	@Query("select a FROM Books a WHERE a.student =:student")
	public List<Books> getBookbyStudent(@Param("student") Student student);
}

