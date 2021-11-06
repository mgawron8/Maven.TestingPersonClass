package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String lastName;
    private String middleName;
    private String Birthdate;
    private int heightInInches;
    private int weight;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setlastName(String lastname) {
        this.lastName = lastname;
    }

    public void setmiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirth(String Birth) {
        this.Birthdate = Birth;
    }

    public void setheightInInches(int height) {
        this.heightInInches = height;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }
    public String getlastName() {
        return lastName;
    }

    public String getmiddleName() {
        return middleName;
    }

    public String getBirth() {
        return Birthdate;
    }

    public int getheightInInches() {
        return heightInInches;
    }

    public int getweight() {
        return weight;
    }


}
