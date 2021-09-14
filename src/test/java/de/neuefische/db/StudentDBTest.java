package de.neuefische.db;

import de.neuefische.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void testList() {
        //GIVEN
        Student[] students = {
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans")
        };
        StudentDB studentDB = new StudentDB(students);

        //WHEN
        Student[] actual = studentDB.list();

        //THEN
        assertArrayEquals(students, actual);
    }

    @Test
    public void testAdd() {
        //GIVEN
        Student[] students = {
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans")
        };
        StudentDB studentDB = new StudentDB(students);

        //WHEN
        studentDB.add(new Student(4, "Hannelore"));

        //THEN
        Student[] actual = studentDB.list();
        assertArrayEquals(new Student[]{
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans"),
                new Student(4, "Hannelore")
        }, actual);

    }

    @Test
    public void testRemove(){
        //GIVEN
        Student[] students = {
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans")
        };
        StudentDB studentDB = new StudentDB(students);

        //WHEN
        studentDB.remove(2);

        //THEN
        Student[] actual = studentDB.list();
        assertArrayEquals(new Student[]{
                new Student(1, "Paul"),
                new Student(3, "Hans")
        }, actual);

    }

    @Test
    public void testRemoveLastStudent(){
        //GIVEN
        Student[] students = {
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hans")
        };
        StudentDB studentDB = new StudentDB(students);

        //WHEN
        studentDB.remove(3);

        //THEN
        Student[] actual = studentDB.list();
        assertArrayEquals(new Student[]{
                new Student(1, "Paul"),
                new Student(2, "Maria")
        }, actual);

    }

}