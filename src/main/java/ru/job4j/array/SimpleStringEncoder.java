package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (symbol == input.charAt(i + 1)) {
                counter++;
            } else {
                result += symbolPlusCounter(symbol, counter);

                symbol = input.charAt(i + 1);
                counter = 1;
            }
        }
        result += symbolPlusCounter(symbol, counter);
        return result;
    }

    private static String symbolPlusCounter(char symbol, int counter) {
        return symbol + (counter > 1 ? counter : "").toString();
    }
}