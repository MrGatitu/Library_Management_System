package com.example.LibraryManagementSystem;

public class Book {
    String author;
    String title;
    int year;

    Book(){}

    Book(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String toString(){
        return String.format(
            "Book[author = "+ author +", title = "+ title +", year = "+ year +" ]"
        );
    }

    public static void main(String[] args) {
       Book newBook = new Book("Ian", "Letter to Her", 2024);
       System.out.println(newBook);
    }


}
