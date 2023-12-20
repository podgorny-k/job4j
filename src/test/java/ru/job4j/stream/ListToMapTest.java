package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.stream.ListToMap.convertListToMap;

public class ListToMapTest {

    @Test
    public void convertStudents() {
        Student student1 = new Student(10, "Ivanov");
        Student student2 = new Student(20, "Petrov");
        Student student3 = new Student(30, "Vodkin");
        Student student4 = new Student(30, "Vodkin");
        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        Map<String, Student> expect = new HashMap<>();
        expect.put(student1.getSurname(), student1);
        expect.put(student2.getSurname(), student2);
        expect.put(student3.getSurname(), student3);

        Map<String, Student> result = convertListToMap(list);
        assertThat(result, is(expect));
    }
}