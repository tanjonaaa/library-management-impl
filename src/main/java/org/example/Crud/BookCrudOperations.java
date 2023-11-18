package org.example.Crud;

import org.example.Entity.Book;

import java.sql.*;
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
                book.setTopic(resultSet.getString("topic"));
                book.setBorrowerId(resultSet.getString("borrowerid"));
                book.setAuthorId(resultSet.getString("authorid"));
                books.add(book);
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
        List<Book> saved = new ArrayList<>();
        for (Book book : toSave) {
            Book savedBook = this.save(book);
            saved.add(savedBook);
        }
        return saved;
    }

    @Override
    public Book save(Book toSave) {
        Book saved = new Book();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "INSERT INTO \"book\" (name, pagenumber, topic, authorid, borrowerid) " +
                    "VALUES (?, ?, CAST(? AS topic), ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, toSave.getName());
            statement.setObject(2, toSave.getPageNumber());
            statement.setString(3, toSave.getTopic());
            statement.setString(4, toSave.getAuthorId());
            statement.setString(5, toSave.getBorrowerId());

            int row = statement.executeUpdate();

            if(row != 0){
                saved = toSave;
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return saved;
    }

    @Override
    public Book delete(Book toDelete) {
        Book deleted = new Book();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "DELETE FROM \"book\" WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, toDelete.getId());

            int row = statement.executeUpdate();

            if(row != 0){
                deleted = toDelete;
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return deleted;
    }
}
