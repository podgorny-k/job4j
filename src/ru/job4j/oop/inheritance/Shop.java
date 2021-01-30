package ru.job4j.oop.inheritance;

public class Shop {
    public static void main(String[] args) {
        Product product = (Product) of("Oil", 100);
        System.out.println(product.label());
    }

    public static Object of(String name, int price) {
        if ("Oil".equals(name)) {
            return new LiquidationProduct(name, price);
        }
        return new Product(name, price);
    }
}