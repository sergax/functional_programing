package com.sergax.functional.chapter_6.xml_tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * @author : sergax
 * @date : 31.05.22
 */

@AllArgsConstructor
@Getter
public class XMLFile {
    private final String id;
    private final String encoding;
    private final List<Tag> tags;
}
