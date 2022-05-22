package com.sergax.functional.chapter_4.constructing_rocket;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * @author : sergax
 * @date : 22.05.22
 *
 * For the class Rocket, create a getter method that returns Optional<NavigationModule>.
 * Please take into account that the navigationModule can be null.
 */

@AllArgsConstructor
@Getter
public class Rocket {
    private final NavigationModule navigationModule;

    public Optional<NavigationModule> getNavigationModule() {
        // write your code here
        return Optional.ofNullable(navigationModule);
    }
}
