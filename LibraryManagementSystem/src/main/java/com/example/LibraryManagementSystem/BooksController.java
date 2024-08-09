package com.example.LibraryManagementSystem;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("books/{id}")
    public Optional<Book> findOneBook(@PathVariable ("id") Integer id){
        return this.booksRepository.findById(id);
    }

    @PostMapping("books")
    public Book addBook(@RequestBody Book book){

        return this.booksRepository.save(book);

    }

    // @DeleteMapping("books/{id}")
    // public Optional<Book> deleteOneBook(@PathVariable ("id") Integer id){
    //     return this.booksRepository.deleteById(id);
    // }

}
