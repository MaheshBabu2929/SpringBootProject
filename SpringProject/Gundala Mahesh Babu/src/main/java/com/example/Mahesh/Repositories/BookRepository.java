package com.example.Mahesh.Repositories;

import com.example.Mahesh.Entities.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<book,Integer> {

   book findById(int bookId);

    List<book> findByBookAuthor(String bookAuthor);
}
