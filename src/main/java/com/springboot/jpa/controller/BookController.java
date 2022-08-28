package com.springboot.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.springboot.jpa.domain.Book;
import com.springboot.jpa.repository.BookRepository;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/list")
public class BookController {

    @Autowired
    BookRepository bookRepository;


    @GetMapping("")
    public List<Book> getBooks() {
        return bookRepository.findAll(Sort.by(Sort.Direction.ASC, "title"));
    }

    @GetMapping("{title}")
    public List<Book> getBookByTitle(@PathVariable String title){
        return bookRepository.findByTitleContaining(title);

    }

    @PutMapping("update")
    public void updateBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @GetMapping("update/{id}")
    public Book getBookById(@PathVariable Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();

        }

        return null;
    }

    @DeleteMapping("delete/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookRepository.deleteById(id);


    }

    @PostMapping("create")
    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);

    }

}
