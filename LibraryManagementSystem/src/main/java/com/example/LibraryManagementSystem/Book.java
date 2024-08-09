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
   private Integer id;



private String author;
   private String title;
   private int year;

    Book(){}

    Book(Integer id, String author, String title, int year){
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format(
            "Book[id = "+ id + " author = "+ author +", title = "+ title +", year = "+ year +" ]"
        );
    }

    // public static void main(String[] args) {
    //    Book newBook = new Book("Ian", "Letter to Her", 2024);
    //    System.out.println(newBook);
    // }


}
