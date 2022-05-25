package com.sergax.functional.chapter_5.online_job_finder;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 25.05.22
 */

@AllArgsConstructor
@Getter
public class JobDescription {
    private final String title;
    private final String company;
    private final int requiredExperienceYears;
}
