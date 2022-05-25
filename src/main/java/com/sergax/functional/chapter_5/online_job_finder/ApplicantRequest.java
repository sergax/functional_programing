package com.sergax.functional.chapter_5.online_job_finder;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 25.05.22
 */

@AllArgsConstructor
@Getter
public class ApplicantRequest {
    private final String company;
    private final int experienceYears;
}
