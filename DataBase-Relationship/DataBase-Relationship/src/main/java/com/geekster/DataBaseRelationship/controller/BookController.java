package com.geekster.DataBaseRelationship.controller;

import com.geekster.DataBaseRelationship.dao.StudentRepo;
import com.geekster.DataBaseRelationship.model.Book;
import com.geekster.DataBaseRelationship.model.Student;
import com.geekster.DataBaseRelationship.service.BookService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private StudentRepo studentRepo;


    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book newBook){
        int bookId=bookService.saveBook(newBook);
        return new ResponseEntity<>("Book save with Book id- "+bookId , HttpStatus.CREATED);
    }


    @GetMapping(value = "/book")
    public ResponseEntity<String> getBook(@Nullable @PathVariable Integer bookId){
        JSONArray bookList=bookService.getBook(bookId);
        return new ResponseEntity<>(bookList.toString(),HttpStatus.OK);
    }


    @PutMapping("/book/{bookId}")
    public ResponseEntity<String> updateBook(@PathVariable Integer bookId,@RequestBody Book updateBook){

        bookService.updateBook(bookId,updateBook);
        return new ResponseEntity<>("Book updated successfully ",HttpStatus.OK);
    }


    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
        boolean status = bookService.deleteBook(bookId);
        if (status) {
            return new ResponseEntity<>("Delete Book successfully book id- " + bookId, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book id doesNot Exist book id- " + bookId, HttpStatus.BAD_REQUEST);
        }
    }
}
