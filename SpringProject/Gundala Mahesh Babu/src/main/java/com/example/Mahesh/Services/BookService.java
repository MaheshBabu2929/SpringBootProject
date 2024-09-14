package com.example.Mahesh.Services;

import com.example.Mahesh.Entities.book;
import com.example.Mahesh.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<List<book>> getAllBook() {
      try{
          List<book> books=bookRepository.findAll();
          if(books.isEmpty()){
              return new ResponseEntity<>(HttpStatus.NO_CONTENT);
          }
          return new ResponseEntity<>(books,HttpStatus.OK);
      }catch(Exception e){
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }

    }

    public book getById(int bookId) {
       return  bookRepository.findById(bookId);
    }

    public List<book> getByBookAuthor(String bookAuthor) {
        return bookRepository.findByBookAuthor(bookAuthor);
    }

    public void addBook(book Book) {
        bookRepository.save(Book);
    }

    public void addAllBooks(List<book> Book) {
        bookRepository.saveAll(Book);
    }
    public void updateById(int bookId, book updatedBook) {
        book old=bookRepository.findById(bookId);
        old.setBookAuthor(updatedBook.getBookAuthor());
        old.setBookTitle(updatedBook.getBookTitle());
         bookRepository.save(old);
    }

    public void deleteById(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
