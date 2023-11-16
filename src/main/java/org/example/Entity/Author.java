package org.example.Entity;

import org.example.Entity.Enum.Sex;

public class Author {
    private String id;
    private String name;
    private Sex sex;
    public Author(String id, String name, Sex sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
