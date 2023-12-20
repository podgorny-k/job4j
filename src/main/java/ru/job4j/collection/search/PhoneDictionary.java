package ru.job4j.collection.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> pName = t -> t.getName().contains(key);
        Predicate<Person> pSurname = t -> t.getSurname().contains(key);
        Predicate<Person> pAddress = t -> t.getAddress().contains(key);
        Predicate<Person> pPhone = t -> t.getPhone().contains(key);
        Predicate<Person> combine = pName.or(pSurname.or(pAddress.or(pPhone)));

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}