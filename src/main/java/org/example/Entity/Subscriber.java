package org.example.Entity;

public class Subscriber extends User{

    public Subscriber(String id, String name, String ref) {
        super(id, name, ref);
    }
    public Subscriber(String name, String ref) {
        super(name, ref);
    }
    public Subscriber() {
        super();
    }
}
