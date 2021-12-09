package kodekveld1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Inneholder løsningsforslag til alle oppgaver
 */
public class Answers {
    private static final List<Integer> numbers = Arrays.asList(1, 10, 100, 2, 20, 3, 30, 4, 5, 6, 7, 8, 9, 50, 40);
    private static final List<String> names = Arrays.asList("Lars", "Arne", "Hans Ludvig");


    /**
     * Sort the array numbersUnsoured in ASC order
     *
     * @return List<Integer>
     */
    public List<Integer> numbersSortASC() {
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    /**
     * Sort the array numbersUnsoured in DESC order
     *
     * @return List<Integer>
     */
    public List<Integer> numbersSortDESC() {
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Return the sum of all elements in the list
     *
     * @return int
     */
    public Integer numbersSum() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Return the names sorted in ASC order
     *
     * @return List<String>
     */
    public List<String> namesASC() {
        return names.stream().sorted().collect(Collectors.toList());
    }

    /**
     * Return a list with all the numbers in the number array that are greater than 50. Must use filter!
     *
     * @return List<Integer>
     */
    public List<Integer> numbersAbove40() {
        return numbers.stream()
                .filter(c -> c > 40)
                .collect(Collectors.toList());
    }

    /**
     * Return numbers with at least two digits, in descending order.
     *
     * @return List<Integer>
     */
    public List<Integer> numbersWithLeastTwoDigitsDESC() {
        return numbersSortDESC().stream().filter(x -> x >= 10).collect(Collectors.toList());
    }

    /**
     * Interfaces for tasks about Lambda functions
     */
    @FunctionalInterface
    interface InterfaceAnonymousLambdaFunction {
        //A method with no parameter
        public String sayHello();
    }

    /**
     * Using an anonymous Lambda function return a String that reads "Hello Cap"
     *
     * @return String
     */
    String anonymousLambdaFunction() {
        Task.InterfaceAnonymousLambdaFunction message = () -> "Hello Cap";
        return message.sayHello();
    }

    @FunctionalInterface
    interface DoubleValueInterface {
        public int doubleValue(int number);
    }

    int doubleValue() {
        Task.DoubleValueInterface doubleNumber = (number) -> number * 2;
        return doubleNumber.doubleValue(10);
    }

    @FunctionalInterface
    interface StringConcatInterface {
        public String stringConcat(String a, String b);
    }

    String StringConcat() {
        Task.StringConcatInterface result = (string1, string2) -> string1 + string2;
        return result.stringConcat("Hello ", "Cap");
    }
}
