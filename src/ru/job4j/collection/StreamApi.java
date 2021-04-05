package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(-1);
        num.add(2);
        num.add(-3);
        num.add(4);

        List<Integer> posNum = num.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
    }
}
