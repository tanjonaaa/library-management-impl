package org.example;

import org.example.Crud.BookCrudOperations;
import org.example.Crud.CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BookCrudOperations books = new BookCrudOperations();
        System.out.println(books.findAll());
    }
}