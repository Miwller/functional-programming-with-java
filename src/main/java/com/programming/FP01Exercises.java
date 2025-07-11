package com.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        //printOddNumbersInListFunctional(numbers);
        //printSquaresOfEvenNumbersInListFunctional(numbers);
        //printCubesOfOddNumbersInListFunctional(numbers);

        List<String> courses =
                List.of("Kubernetes", "Spring", "Spring Boot", "API", "Microservices",
                        "AWS", "PCF", "Azure", "Docker", "AWS", "Kubernetes");

        //courses.forEach(System.out::println);

        /*courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);*/

        /*courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);*/

        /*courses.stream()
                .map(course -> course + ": " + course.length())
                .forEach(System.out::println);*/

        printDistinctAndSortedByLength(courses);

        List<Integer> lengthCourses = lengthCourses(courses);

        System.out.println(lengthCourses);

    }

    private static List<Integer> lengthCourses(List<String> courses) {

        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());

    }

    private static void printDistinctAndSortedByLength(List<String> courses) {

        courses.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }

    private static void printDistinctAndSorted(List<String> courses) {

        courses.stream().distinct().sorted().forEach(System.out::println);

    }

    private static void printDistinctAndSortedInverted(List<String> courses) {

        courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {

        //What to do?
        numbers.stream()
                //.filter(FP01Functional::isEven)
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println); //Method Reference

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

        //What to do?
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println); //Method Reference

    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {

        //What to do?
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println); //Method Reference

    }

}

