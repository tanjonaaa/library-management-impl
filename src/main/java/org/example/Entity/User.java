package org.example.Entity;

public class User {
    private String id;
    private String name;
    private String ref;
    public User(String id, String name, String ref){
        this.id = id;
        this.name = name;
        this.ref = ref;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
