package de.neuefische;

import de.neuefische.db.StudentDB;
import de.neuefische.model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans")
        };
        StudentDB studentDB = new StudentDB(students);
        Student randomStudent = studentDB.randomStudent();
        System.out.println(randomStudent);
    }
}
