package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(a -> a.getAddress())
                .collect(Collectors.toList());
    }

    public static List<Address> sortedCollect(List<Profile> profiles) {
        return profiles.stream()
                .map(a -> a.getAddress())
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
