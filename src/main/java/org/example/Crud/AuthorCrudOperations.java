package org.example.Crud;

import org.example.Entity.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorCrudOperations implements CrudOperations<Author>{
    @Override
    public List<Author> findAll() {
        List<Author> authors = new ArrayList<>();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "SELECT * FROM \"author\"";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Author author = new Author();
                author.setId(resultSet.getString("id"));
                author.setName(resultSet.getString("name"));
                author.setSex(resultSet.getString("sex"));
                authors.add(author);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return authors;
    }

    @Override
    public List<Author> saveAll(List<Author> toSave) {
        List<Author> saved = new ArrayList<>();
        for (Author author : toSave) {
            Author savedAuthor = this.save(author);
            saved.add(savedAuthor);
        }
        return saved;
    }

    @Override
    public Author save(Author toSave) {
        Author saved = new Author();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "INSERT INTO \"author\" (name, sex) " +
                    "VALUES (?, CAST(? AS sex))";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, toSave.getName());
            statement.setString(2, toSave.getSex());

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
    public Author delete(Author toDelete) {
        Author deleted = new Author();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "DELETE FROM \"author\" WHERE id = ?";

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
