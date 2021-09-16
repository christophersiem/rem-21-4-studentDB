package de.neuefische;

import de.neuefische.db.StudentDB;
import de.neuefische.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hansi"));
        students.add(new Student(2, "Maria"));

        StudentDB studentDb = new StudentDB(students);

        studentDb.add(new Student(2, "Maria"));

        System.out.println(students);
    }
}
