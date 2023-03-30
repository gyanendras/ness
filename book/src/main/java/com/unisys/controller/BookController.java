package com.unisys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unisys.domain.Book;
import com.unisys.services.BookService;

import jakarta.transaction.Transactional;

@Controller
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	
	@RequestMapping(value="/book",method=RequestMethod.POST) 
	@ResponseBody
	private Book createBook(@RequestBody Book book) {
		return bookservice.createBook(book);
	}
	
	
	@RequestMapping(value="/book/{bookId}",method=RequestMethod.GET) 
	@ResponseBody
	private Book getBook(@PathVariable Long bookId) {
		return bookservice.getBook(bookId);
	}

}
