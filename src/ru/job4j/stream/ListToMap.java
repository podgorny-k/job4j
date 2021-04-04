package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public static Map<String, Student> convertListToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        s -> s.getSurname(),
                        Function.identity(),
                        (s1, s2) -> s1));
    }
}
