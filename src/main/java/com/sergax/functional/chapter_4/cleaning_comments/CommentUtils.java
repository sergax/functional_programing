package com.sergax.functional.chapter_4.cleaning_comments;

import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * by Aksenchenko Serhii on 16.05.2022
 */

@NoArgsConstructor
public class CommentUtils {
    /**
     * An example string that fits the format "15-03-2020 10:20:34".
     * Use it to print the comments.
     */
    public static final SimpleDateFormat TEXT_FORMATTER = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    /**
     * It processes a given list of comments by removing old comments and shortening the text length
     */
    public static void handleComments(List<Comment> comments, Date thresholdDate, int maxTextLength) {
        comments.removeIf(n -> n.getCreated().before(thresholdDate));
        comments.replaceAll(n -> new Comment(
                n.getCreated(),
                n.getText().substring(0, Math.min(n.getText().length(), maxTextLength))));
    }

    /**
     * It prints each comment in the following format:
     * [14-03-2020 10:20:34] What a beautiful photo! Where is it?
     * [16-03-2020 15:35:18] I do not know, I just found it on the internet!
     * [20-03-2020 19:10:22] Is anyone here?
     * Please, use the formatter above to fit the format.
     */
    public static void printComments(List<Comment> comments) {
        comments.forEach(n ->
                System.out.println(
                        List.of(
                                CommentUtils.TEXT_FORMATTER.format(
                                        n.getCreated())) + " " +
                                        n.getText()));
        // write your code here
    }
}
