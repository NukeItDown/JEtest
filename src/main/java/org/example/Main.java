package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> allStudents = new ArrayList<Student>();
        List<Teacher> allTeachers = new ArrayList<Teacher>();

        allStudents.add(new Student("Mike","Folk",1));
        allStudents.add(new Student("James","Chalk",2));
        allStudents.add(new Student("Livia","Oto",2));

        allTeachers.add(new Teacher("Zara","Karamez",2));
        allTeachers.add(new Teacher("Tomas","Gonk",2));

        allStudents.forEach(item -> System.out.println(item.getFirstname() + " " + item.getLastname()));
        allTeachers.forEach(item -> System.out.println(item.profile()));

    }
}