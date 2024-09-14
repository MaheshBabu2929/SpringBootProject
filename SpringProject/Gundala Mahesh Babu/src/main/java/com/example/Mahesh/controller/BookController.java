package com.example.Mahesh.controller;

import com.example.Mahesh.Entities.book;
import com.example.Mahesh.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("books/")
public class BookController {
    @Autowired //It is used to create an object
    BookService bookService;

@GetMapping("getAll")
    public ResponseEntity<List<book>> getAllBook(){
    return bookService.getAllBook();
}

@GetMapping("getByID-{bookId}")
    public book getById(@PathVariable int bookId){
    return  bookService.getById(bookId);
}

@GetMapping("getByAuthor-{bookAuthor}")
    public List<book> getByBookAuthor(@PathVariable String bookAuthor){
    return bookService.getByBookAuthor(bookAuthor);
}

@PostMapping("addBook")
    public String addBook(@RequestBody book Book){
    bookService.addBook(Book);
    return "Successfully added the new Book:"+Book;
}

@PostMapping("addAllBooks")
    public String addAllBooks(@RequestBody List<book> Book){
    bookService.addAllBooks(Book);
    return "Successfully added the list of books";
}

@PutMapping("updateBook")
    public String updateById(@PathVariable int bookId,@RequestBody book updatedBook){
     bookService.updateById(bookId,updatedBook);
     return "Successfully updated the previous details";
}
@DeleteMapping("deleteBYId-{bookId}")
    public String deleteById(@PathVariable int bookId){
    bookService.deleteById(bookId);
    return "Successfully deleted by using id:"+bookId;
}
}
