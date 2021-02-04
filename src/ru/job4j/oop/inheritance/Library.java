package ru.job4j.oop.inheritance;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("book1", 100);
        Book book2 = new Book("book2", 200);
        Book book3 = new Book("book3", 300);
        Book book4 = new Book("Clean code", 400);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (Book boo : books) {
            System.out.println(boo.name + " - " + boo.pages);
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book boo : books) {
            System.out.println(boo.name + " - " + boo.pages);
        }

        for (Book boo : books) {
            if ("Clean code".equals(boo.name)) {
                System.out.println(boo.name + " - " + boo.pages);
            }
        }
    }
}