package de.neuefische.db;

import de.neuefische.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void testList() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        List<Student> actual = studentDB.list();

        //THEN
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")));
        assertEquals(expected, actual);
    }


    @Test
    public void testAdd() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        studentDB.add(new Student(3, "Hannelore"));

        //THEN
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria"),
                new Student(3, "Hannelore")
        ));
        List<Student> actual = studentDB.list();
        assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        //GIVEN
        StudentDB studentDB = new StudentDB(List.of(
                new Student(1, "Paul"),
                new Student(2, "Maria")
        ));

        //WHEN
        studentDB.remove(2);

        //THEN
        List<Student> actual = studentDB.list();
        List<Student> expected = new ArrayList<>(List.of(
                new Student(1, "Paul")

        ));
        assertEquals(expected, actual);

    }


}