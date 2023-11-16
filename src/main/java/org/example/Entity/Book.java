package org.example.Entity;

import org.example.Entity.Enum.Topic;

public class Book {
    private String id;
    private String name;
    private int pageNumber;
    private Topic topic;
    private String authorId;
    private String borrowerId;
    public Book(String id, String name, int pageNumber, Topic topic, String authorId, String borrowerId) {
        this.id = id;
        this.name = name;
        this.pageNumber = pageNumber;
        this.topic = topic;
        this.authorId = authorId;
        this.borrowerId = borrowerId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public Topic getTopic() {
        return topic;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getBorrower() {
        return borrowerId;
    }

    public void setBorrower(String borrowerId) {
        this.borrowerId = borrowerId;
    }
}
