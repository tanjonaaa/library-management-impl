package org.example.Entity;

import org.example.Entity.Enum.Topic;

public class Book {
    private String id;
    private String name;
    private int pageNumber;
    private Topic topic;
    private Author author;
    private Subscriber borrower;
    public Book(String id, String name, int pageNumber, Topic topic, Author author, Subscriber borrower) {
        this.id = id;
        this.name = name;
        this.pageNumber = pageNumber;
        this.topic = topic;
        this.author = author;
        this.borrower = borrower;
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

    public Author getAuthor() {
        return author;
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

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Subscriber getBorrower() {
        return borrower;
    }

    public void setBorrower(Subscriber borrower) {
        this.borrower = borrower;
    }
}
