package student_yevgeniy_tolks.training.imperativeProgramming.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

class FFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        Function<Integer, Double> addBy1AndThenMultiplyBy10AndThenSubBy10 = incrementByOneFunction
                .andThen(multiplyBy10Function)
                .andThen(subtractBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10AndThenSubBy10.apply(10));

        BiFunction<Integer, Integer, Integer> sumOfTwoNumbers = FFunction.sumOfTwoNumbers;
        System.out.println(sumOfTwoNumbers.apply(10, 50));

        BiFunction<Integer, Integer, Integer> sumOfTwoSpecifiedFunctions1 = FFunction.sumOfTwoSpecifiedFunctions
                .andThen(multiplyBy10Function);
        System.out.println(sumOfTwoSpecifiedFunctions1.apply(10, 11));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Double> subtractBy10Function = number -> number.doubleValue() - 10;

    static BiFunction<Integer, Integer, Integer> sumOfTwoNumbers = (number, number1) -> number + number1;

    static BiFunction<Integer, Integer, Integer> sumOfTwoSpecifiedFunctions = (multiplyBy10Function, subtractBy10Function) ->
            multiplyBy10Function + subtractBy10Function;

}
