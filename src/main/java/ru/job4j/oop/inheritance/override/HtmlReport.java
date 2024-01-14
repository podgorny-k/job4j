package ru.job4j.oop.inheritance.override;

import ru.job4j.oop.inheritance.TextReport;

public class HtmlReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>" + "<span>"
                + body + "</span>";
    }
}