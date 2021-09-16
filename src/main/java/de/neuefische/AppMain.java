package de.neuefische;

import de.neuefische.db.StudentDB;
import de.neuefische.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {

        StudentDB studentDb = new StudentDB(new ArrayList<>());
        studentDb.add(new Student(1, "Hansi"));
        studentDb.add(new Student(2, "Maria"));
        studentDb.add(new Student(3, "Franz"));

        int id = 3;
        Optional<Student> foundStudent = studentDb.getById(id);

        if(foundStudent.isPresent()){
            System.out.println("Found student:" + foundStudent.get().getName());
        } else {
            System.out.println("Not found!");
        }


    }
}
