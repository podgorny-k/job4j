package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");

        int inE = 140;
        int expectedE = 2;
        int outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("140 rubles are 2 euro. Test result : " + passedE);

        int inD = 120;
        int expectedD = 2;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedD);
    }
}