package org.example.Entity;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private String id;
    private String name;
    private String ref;

    public User(String id, String name, String ref) {
        this.id = id;
        this.name = name;
        this.ref = ref;
    }

    public User() {
        this.id = null;
        this.name = null;
        this.ref = null;
    }

    public User(String name, String ref){
        this.id = null;
        this.name = name;
        this.ref = ref;
    }
}
