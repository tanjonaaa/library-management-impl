package org.example.Crud;

import org.example.Entity.Subscriber;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubscribersCrudOperations implements CrudOperations<Subscriber>{
    @Override
    public List<Subscriber> findAll() {
        List<Subscriber> subscribers = new ArrayList<>();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "SELECT * FROM \"subscriber\"";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Subscriber subscriber = new Subscriber();
                subscriber.setId(resultSet.getString("id"));
                subscriber.setName(resultSet.getString("name"));
                subscriber.setRef(resultSet.getString("ref"));
                subscribers.add(subscriber);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return subscribers;
    }

    @Override
    public List<Subscriber> saveAll(List<Subscriber> toSave) {
        List<Subscriber> saved = new ArrayList<>();
        for (Subscriber subscriber : toSave) {
            Subscriber savedSubscriber = this.save(subscriber);
            saved.add(savedSubscriber);
        }
        return saved;
    }

    @Override
    public Subscriber save(Subscriber toSave) {
        Subscriber saved = new Subscriber();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "INSERT INTO \"subscriber\" (name, ref) VALUES (?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, toSave.getName());
            statement.setString(2, toSave.getRef());

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
    public Subscriber delete(Subscriber toDelete) {
        Subscriber deleted = new Subscriber();
        try {
            Connection connection = org.example.Connection.getConnection();
            String sql = "DELETE FROM \"subscriber\" WHERE id = ?";

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

