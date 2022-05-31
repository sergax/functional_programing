package com.sergax.functional.chapter_6.xml_tags;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * @author : sergax
 * @date : 31.05.22
 * <p>
 * Implement the XmlUtils.countAllByTagName method that accepts a list of XML files and a tag name and produces a map
 * whose keys are the XML file encoding, and the corresponding values are the total numbers of tags in the files that
 * contain the specified tag.
 * If the XML file tags do not contain the specified tag name, the value should be equal to 0.
 */

public class XMLUtils {
    public static Map<String, Long> countAllByTagName(List<XMLFile> files, String tagName) {
        return files.stream()
                .collect(groupingBy(XMLFile::getEncoding,
                        mapping(XMLFile::getTags,
                                filtering(file -> file.stream()
                                                .map(Tag::getName)
                                                .anyMatch(tagName::equals),
                                        summingLong(List::size)))));
        // write your code here
    }
}
