package com.sergax.functional.chapter_5.processing_delevery_orders;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 24.05.22
 *
 * The findFirstOrder method takes a list of orders and must return the first / earliest order in the list according
 * to the value of the deliveryDate field. If the list is empty, the method must return an order created by its default
 * constructor ("the empty order").
 *
 * The printAddressesToDeliver method also takes a list of orders and must print addresses sorted by deliveryDate
 * (from the earliest to the latest one) without duplicates. Every address must be print on a new line. If the list
 * contains a duplicate, only the first order should be printed to avoid visiting the same address twice.
 */

public class ProcessDeliveryOrders {
    public static DeliveryOrder findFirstOrder(List<DeliveryOrder> orders) {
        return orders.stream().min(DeliveryOrder.getComparatorByDeliveryDate())
                .orElse(new DeliveryOrder()); // write your code here
    }

    public static void printAddressesToDeliver(List<DeliveryOrder> orders) {
        // write your code here
        orders.stream().sorted(DeliveryOrder.getComparatorByDeliveryDate()).distinct()
                .map(DeliveryOrder::getAddress)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        List<DeliveryOrder> orders = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine().split("\\|"))
                .map(parts -> new DeliveryOrder(
                        Long.parseLong(parts[0]), parts[2], LocalDate.parse(parts[1])))
                .collect(Collectors.toList());

        System.out.println(findFirstOrder(orders));

        printAddressesToDeliver(orders);
    }
}
