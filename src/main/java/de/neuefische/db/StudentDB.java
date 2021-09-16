package de.neuefische.db;

import de.neuefische.model.Student;

import java.util.*;

public class StudentDB {
    private Map<Integer, Student> students = new TreeMap<>();

    public StudentDB(List<Student> students) {
        add(students);
    }

    public List<Student> list() {
        return new ArrayList<>(students.values());
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

        if(this.students.containsKey(student.getId())){
            throw new RuntimeException("The given Student has been already added! Given id: " + student.getId());
        }

        students.put(student.getId(), student);
    }

    public void add(List<Student> students) {
        for (Student student : students) {
            add(student);
        }
    }


    public void remove(int studentId) {
        students.remove(studentId);
    }

}
