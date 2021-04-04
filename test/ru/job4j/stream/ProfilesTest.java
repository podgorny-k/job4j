package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address1 = new Address("Moscow", "Tverskaya", 5, 1);
        Address address2 = new Address("Smolensk", "Lenina", 6, 7);
        Address address3 = new Address("Samara", "Gagarina", 8, 6);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);

        List<Profile> profiles = Arrays.asList(profile1, profile2, profile3);
        List<Address> expect = Arrays.asList(address1, address2, address3);
        List<Address> result = Profiles.collect(profiles);
        assertThat(result, is(expect));
    }
}