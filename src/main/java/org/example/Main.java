package org.example;

import org.example.Crud.AuthorCrudOperations;
import org.example.Crud.BookCrudOperations;
import org.example.Crud.SubscribersCrudOperations;
import org.example.Entity.Author;
import org.example.Entity.Book;
import org.example.Entity.Subscriber;
import org.example.Entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Find all
        BookCrudOperations crudBooks = new BookCrudOperations();
        AuthorCrudOperations crudAuthors = new AuthorCrudOperations();
        SubscribersCrudOperations crudSubscribers = new SubscribersCrudOperations();
        System.out.println(crudBooks.findAll().toString());
        System.out.println(crudAuthors.findAll().toString());
        System.out.println(crudSubscribers.findAll().toString());
        //Save all
        List<Book> books = Arrays.asList(
                new Book("Moby dick", 100, "Other"),
                new Book("SNK", 500, "Other")
        );
        List<Author> authors = Arrays.asList(
          new Author("George R.R Martin", "M"),
          new Author("Tanjona", "M")
        );
        List<Subscriber> subscribers = Arrays.asList(
                new Subscriber("Test123", "test123"),
                new Subscriber("test321", "test321")
        );
        System.out.println(crudBooks.saveAll(books));
        System.out.println(crudAuthors.saveAll(authors));
        System.out.println(crudSubscribers.saveAll(subscribers));
        //Delete
        System.out.println(crudBooks.delete(
                new Book("f4968df9-d785-4e72-9589-177672863a38", "Moby dick", 100, "Other", null, null))
        );
        System.out.println(crudAuthors.delete(
                new Author("cc381cae-c851-4366-b8a8-96c4d5f1d183", "Tanjona", "M")
        ));
        System.out.println(crudSubscribers.delete(
                new Subscriber("819b25ed-1464-4b05-8354-80c9bef73c1a", "test321", "test321")
        ));
    }
}