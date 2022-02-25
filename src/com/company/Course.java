package com.company;

import java.util.Arrays;

public class Course {
    private String name;
    private String address;
    private Student[] students;

    public Course(String name, String address, Student[] students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course - " +
                "name: " + name + '\t' +
                "address: " + address + '\n' +
                "students: " + Arrays.toString(students);
    }
}
