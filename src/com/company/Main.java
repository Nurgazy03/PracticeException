package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student = new Student("Almaz",15,"Java-5",(byte) 5);
        Student student2 = new Student("Bekjan",5,"Java-5",(byte) 3);
        Student student3 = new Student("Kuba",19,"Java-5",(byte) 11);
        Student student4 = new Student("",9,"JavaScript",(byte) 11);
        Student student5 = new Student("Kabi",9,"JavaScript",(byte) 11);
        Student student6 = new Student("Kabi",9,"JavaScript",(byte) 11);

        Student[] students = {student,student2,student3,student4,student5,student6};

        Course course = new Course("PeaksoftHose","Grajdanskaiy",students);

        System.out.println(course);
        for (Student b : students) {
            if (b.getClass().getName().equals("com.company.Student")) {
            }
            System.out.println(b.getName()+" "+b.getAge()+" "+b.getGroup()+" "+b.getBatch());
        }

    }
}
