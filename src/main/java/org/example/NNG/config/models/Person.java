package org.example.NNG.config.models;

public class Person {
    private int id;
    private String name;

    public Person(String name, int id){
        this.name=name;
        this.id=id;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
