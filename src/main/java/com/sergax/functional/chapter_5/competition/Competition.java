package com.sergax.functional.chapter_5.competition;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 * You need to implement the getTeamPlaceMap that accepts an unordered collection of teams and returns a map
 * containing team names as keys and their positions as values in the sorted order (from the best to the worst position).
 */

public class Competition {
    public static Map<String, Integer> getTeamPlaceMap(Collection<Team> teams) {
        // key : teamName value : position order : from the best
        return teams.stream()
                .sorted(Comparator.comparingInt(Team::getPlace))
                .collect(Collectors.toMap(Team::getName, Team::getPlace,
                        (a, b) -> a, LinkedHashMap::new));
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Team> teams = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine().split("\\s+"))
                .map(parts -> new Team(parts[0], Integer.parseInt(parts[1])))
                .collect(Collectors.toSet());

        getTeamPlaceMap(teams)
                .forEach((team, speaker) -> System.out.println(team + ": " + speaker));
    }
}
