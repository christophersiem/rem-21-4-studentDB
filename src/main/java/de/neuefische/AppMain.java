package de.neuefische;

import de.neuefische.model.Student;

import java.util.HashMap;
import java.util.Map;

public class AppMain {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();
        students.put("student1", new Student(1, "Hans"));
        students.put("student2", new Student(2, "Maria"));

        Map<Integer, Student> students2 = new HashMap<>();
        students2.put(1, new Student(1, "Franz"));
    }
}
