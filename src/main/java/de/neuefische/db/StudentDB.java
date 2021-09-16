package de.neuefische.db;

import de.neuefische.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    private List<Student> students;

    public StudentDB(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Student> list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student randomStudent() {
        double random = Math.random();
        int randomIndex = (int) (random * students.size());
        return students.get(randomIndex);
    }

    public void add(Student student) {
        students.add(student);
    }


    public void remove(int studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return;
        }
        students.remove(student);
    }

    private Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}
