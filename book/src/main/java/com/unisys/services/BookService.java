package com.unisys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unisys.domain.Book;
import com.unisys.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepository;

	public Book createBook(Book book){
		return bookrepository.save(book);
		
	}

	public Book getBook(Long bookId) {
		// TODO Auto-generated method stub
		return bookrepository.findById(bookId).get();
	}
}
