package com.sergax.functional.chapter_6.xml_tags;

import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * @author : sergax
 * @date : 31.05.22
 */
public class Main {
    public static void main(String[] args) {
        List<XMLFile> xmlFiles = List.of(
                new XMLFile("1", "UTF-8", List.of(new Tag("function"), new Tag("load"))),
                new XMLFile("2", "UTF-8", List.of(new Tag("table"), new Tag("main"))),
                new XMLFile("3", "ASCII", List.of(new Tag("row"), new Tag("column"))),
                new XMLFile("4", "ASCII", List.of(new Tag("sheet"), new Tag("row"))),
                new XMLFile("5", "ASCII", List.of(new Tag("sheet"), new Tag("column"), new Tag("row")))
        );

        XMLUtils.countAllByTagName(xmlFiles, "sheet").entrySet().forEach(System.out::println);
    }
}
