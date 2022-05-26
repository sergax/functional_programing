package com.sergax.functional.chapter_5.countries;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 * Here you need to implement the getNamesOfTop3PopulatedCountries to return a list that contains three country
 * names which have the largest populations from all countries of the original collection.
 * The names must be in uppercase and sorted according to the population size (from the largest to the smallest population).
 */

public class Countries {
    public static List<String> getNamesOfTop3PopulatedCountries(Collection<Country> countries) {
        return countries.stream()
                .sorted(Comparator.comparingInt(Country::getPopulation).reversed())
                .limit(3)
                .map(Country::getName).map(String::toUpperCase).toList();
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Country> countries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\s+");
                    return new Country(parts[0], Integer.parseInt(parts[1]));
                })
                .collect(Collectors.toList());

        getNamesOfTop3PopulatedCountries(countries)
                .forEach(System.out::println);
    }
}
