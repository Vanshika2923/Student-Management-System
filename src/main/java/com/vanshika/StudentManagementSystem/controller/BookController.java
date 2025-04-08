package com.vanshika.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanshika.StudentManagementSystem.Entity.Books;
import com.vanshika.StudentManagementSystem.Entity.Student;
import com.vanshika.StudentManagementSystem.repository.BookRepository;
import com.vanshika.StudentManagementSystem.service.BookService;


@RestController
@RequestMapping("/Librarian")
public class BookController {
	
	@Autowired
	BookService BS;
	
	@Autowired
	BookRepository BR;
	
	@PostMapping("/AddBook")
	public Books addBooks(@RequestBody Books b) {
		return BS.addBooks(b);
	}
	
	
	@GetMapping("/SAB")
	public List<Books> getBooks(){
		return BS.getBooks();
	}
	
	  
    @GetMapping("/BBS/{student}")
    public List<Books> getBookbyStudent( @PathVariable("student")Student student){
    	return BR.getBookbyStudent(student);
    	
    }

}
