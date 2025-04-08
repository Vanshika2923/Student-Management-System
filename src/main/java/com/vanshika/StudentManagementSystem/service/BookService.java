package com.vanshika.StudentManagementSystem.service;

import java.util.List;

import com.vanshika.StudentManagementSystem.Entity.Books;

public interface BookService {
	
	public Books addBooks(Books b) ;
	public List<Books> getBooks();

}
