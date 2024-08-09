package com.example.LibraryManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class BooksController {

    private final BooksRepository booksRepository ;

    public BooksController(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }

    @GetMapping("books")
    public Iterable<Book> findAllBooks(){
        return this.booksRepository.findAll();
    }

    @PostMapping("books")
    public Book addBook(@RequestBody Book book){

        return this.booksRepository.save(book);

    }
}
