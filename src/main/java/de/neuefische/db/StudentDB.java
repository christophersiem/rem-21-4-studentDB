package de.neuefische.db;

import de.neuefische.model.Student;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent() {
        double random = Math.random();
        int randomIndex = (int) (random * students.length);
        return students[randomIndex];
    }

    public void add(Student student) {
        Student[] updatedStudents = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }
        updatedStudents[updatedStudents.length - 1] = student;
        students = updatedStudents;
    }


}
