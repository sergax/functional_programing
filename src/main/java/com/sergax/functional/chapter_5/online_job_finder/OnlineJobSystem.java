package com.sergax.functional.chapter_5.online_job_finder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 25.05.22
 */

public class OnlineJobSystem {
    public static long calculateNumberOfVacancies(ApplicantRequest request, Collection<JobDescription> jobs) {
        return jobs.stream()
                .filter(n -> Objects.equals(n.getCompany(), request.getCompany()) &&
                        n.getRequiredExperienceYears() <= request.getExperienceYears())
                .count(); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ApplicantRequest request = Optional.of(scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\|");
                    return new ApplicantRequest(parts[0], Integer.parseInt(parts[1]));
                }).get();

        List<JobDescription> jobs = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\|");
                    return new JobDescription(parts[0], parts[1], Integer.parseInt(parts[2]));
                })
                .collect(Collectors.toList());

        System.out.println(calculateNumberOfVacancies(request, jobs));
    }
}
