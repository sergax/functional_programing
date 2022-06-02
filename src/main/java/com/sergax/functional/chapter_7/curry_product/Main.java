package com.sergax.functional.chapter_7.curry_product;

import java.util.Scanner;

import static com.sergax.functional.chapter_7.curry_product.CurryProduct.calc;

/**
 * @author : sergax
 * @date : 02.06.22
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        int x = Integer.parseInt(values[0]);
        int y = Integer.parseInt(values[1]);
        int z = Integer.parseInt(values[2]);

        System.out.println(calc(x, y, z));
    }
}
