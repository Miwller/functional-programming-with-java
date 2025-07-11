package com.programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {



    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        List<Integer> doubledNumbers = doubleList(numbers);

        List<Integer> evenNumbersOnly = evenNumbersOnly(numbers);

        System.out.println(evenNumbersOnly);

        int sum = addListFunctional(numbers);
        System.out.println(sum);

        int sum2 = sumSquare(numbers);
        System.out.println(sum2);

        int sum3 = sumCubes(numbers);
        System.out.println(sum3);

        int sum4 = sumOddNumbers(numbers);
        System.out.println(sum4);

    }

    private static List<Integer> evenNumbersOnly(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

    }

    private static List<Integer> doubleList(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

    }

    private static int sumOddNumbers(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum);

    }

    private static int sumCubes(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> number * number * number)
                .reduce(0, Integer::sum);

    }

    private static int sumSquare(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);

    }

    private static int sum(int aggregate, int nextNumber) {
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {

       return numbers.stream()
               //.reduce(0, FP02Functional::sum);
               .reduce(0, Integer::sum);
    }


}

