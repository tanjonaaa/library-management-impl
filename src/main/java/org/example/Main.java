package org.example;

import org.example.Crud.AuthorCrudOperations;
import org.example.Crud.BookCrudOperations;
import org.example.Crud.SubscribersCrudOperations;
import org.example.Entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Find all
        BookCrudOperations books = new BookCrudOperations();
        AuthorCrudOperations authors = new AuthorCrudOperations();
        SubscribersCrudOperations subscribers = new SubscribersCrudOperations();
        System.out.println(books.findAll().toString());
        System.out.println(authors.findAll().toString());
        System.out.println(subscribers.findAll().toString());
    }
}