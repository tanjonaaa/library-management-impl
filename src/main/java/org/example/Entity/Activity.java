package org.example.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    private String id;
    private String SubscriberId;
    private List<Book> books;
    private LocalDateTime createdAt;

    public Activity(String id, String subscriberId, List<Book> books, LocalDateTime createdAt) {
        this.id = id;
        SubscriberId = subscriberId;
        this.books = books;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubscriberId() {
        return SubscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        SubscriberId = subscriberId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
