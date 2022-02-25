package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private byte batch;

    public Student(String name, int age, String group, byte batch) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age < 16) {
        try {
            throw new InvalidAgeException();
        } catch (InvalidAgeException f) {
            System.out.println("You are younger than 16");
        }
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public byte getBatch() {
        return batch;
    }

    public void setBatch(byte batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "name: " + name + '\n' +
                "age: " + age +
                "group: " + group + '\n' +
                "batch: " + batch ;
    }
}
