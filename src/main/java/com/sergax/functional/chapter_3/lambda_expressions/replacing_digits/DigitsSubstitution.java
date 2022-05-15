package com.sergax.functional.chapter_3.lambda_expressions.replacing_digits;

import java.util.Scanner;

/**
 * by Aksenchenko Serhii on 29.03.2022
 * ***********************************
 * The task is :
 * Replacing digits of a number
 * In this task, you need to write your own rule and pass it to the substitution method
 * to replace the digits of a number. The definition is exactly the same as shown in the previous step.
 * <p>
 * public static int substitution(long n, Function<Integer, Integer> digitRule)
 * The rule should act as the following:
 * <p>
 * if the digit is 5, it should replace it with 1;
 * if the digit is 6, it should replace it with 2;
 * if the digit is 7, it should replace it with 3;
 * if the digit is 8, it should replace it with 4;
 * if the digit is 9, it should replace it with 5;
 * any other digits shouldn't be replaced.
 * There is a whole variety of ways to contrive this rule. The shorter your solution, the better! :)
 * <p>
 * Note that the substitution method belongs to the Utils class.
 * <p>
 * Sample Input:
 * <p>
 * 12765
 * Sample Output:
 * <p>
 * 12321
 */
public class DigitsSubstitution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        int result = Utils.substitution(n, digit ->
                switch (digit) {
                    case 5 -> 1;
                    case 6 -> 2;
                    case 7 -> 3;
                    case 8 -> 4;
                    case 9 -> 5;
                    default -> digit;
                });

        /**
         * Or u could resolve this task with next approach :
         */

        int result2 = Utils.substitution(n, digit -> digit > 4 ? digit - 4 : digit);

        System.out.println(result);
        System.out.println(result2);
    }
}
