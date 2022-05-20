package com.sergax.functional.chapter_4.cleaning_comments;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * by Aksenchenko Serhii on 16.05.2022
 */

@AllArgsConstructor
@Data
public class Comment {
    private Date created;
    private String text;
}
