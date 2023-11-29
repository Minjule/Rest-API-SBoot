package com.example.demo.client;
import java.time.LocalDate;;

public class Client {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;
    
    public Client() {
    }


    public Client(Long id, String name, String email, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", dob='" + getDob() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


}
