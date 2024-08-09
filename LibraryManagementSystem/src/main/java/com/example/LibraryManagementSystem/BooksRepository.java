package com.example.LibraryManagementSystem;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Integer> {

}
