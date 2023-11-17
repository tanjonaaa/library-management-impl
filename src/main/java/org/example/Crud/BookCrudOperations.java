package org.example.Crud;

import org.example.Entity.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookCrudOperations implements CrudOperations<Book> {
    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "SELECT * FROM \"book\"";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getString("id"));
                book.setName(resultSet.getString("name"));
                book.setPageNumber((Integer) resultSet.getObject("pagenumber"));
                book.
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    @Override
    public List<Book> saveAll(List<Book> toSave) {
        return null;
    }

    @Override
    public Book save(Book toSave) {
        return null;
    }

    @Override
    public Book delete(Book toDelete) {
        return null;
    }
}
