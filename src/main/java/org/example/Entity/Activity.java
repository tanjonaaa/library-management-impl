package org.example.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    private String id;
    private String SubscriberId;
    private String bookId;
    private LocalDateTime createdAt;

    public Activity(String id, String subscriberId, String bookId, LocalDateTime createdAt) {
        this.id = id;
        SubscriberId = subscriberId;
        this.bookId = bookId;
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

    public String getBookId() {
        return bookId;
    }

    public void setBooks(String bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
