package com.example.LibraryManagementSystem;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String author;
    String title;
    int year;

    Book(){}

    Book(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format(
            "Book[author = "+ author +", title = "+ title +", year = "+ year +" ]"
        );
    }

    // public static void main(String[] args) {
    //    Book newBook = new Book("Ian", "Letter to Her", 2024);
    //    System.out.println(newBook);
    // }


}
