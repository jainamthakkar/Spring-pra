package com.example.DependencyInjection_01;

public class Employee {

    private int id;
    private String name;

    public Employee() {
        System.out.println("def cons");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee (int id, String name){
        this.id = id;
        this.name = name;
    }
    void show(){
        System.out.println(id + " " + name);
    }
}
