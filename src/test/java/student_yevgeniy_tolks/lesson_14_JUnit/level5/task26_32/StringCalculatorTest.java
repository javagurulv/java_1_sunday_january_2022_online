package student_yevgeniy_tolks.lesson_14_JUnit.level5.task26_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void sumIsZeroInCaseOfEmptyStringTest() {
        String numbers = "";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 0);
    }

    @Test
    public void sumWithOneNumberInStringTest() {
        String numbers = "9";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 9);
    }

    @Test
    public void sumWithTwoNumbersInTheStringTest() {
        String numbers = "2,6";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 8);
    }

    @Test
    public void sumWithAnyAmountOfNumbersInStringTest() {
        String numbers = "2,6,4,5,7,3,2";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 29);
    }

    @Test
    public void sumOfNumbersInTheStringIgnoringSpecialSymbolsTestV1() {
        String numbers = "2\n12,9";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 14);
    }

    @Test
    public void sumOfNumbersInTheStringIgnoringSpecialSymbolsTestV2() {
        String numbers = "//[;]\n5;5";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 10);
    }
    @Test
    public void sumOfNumbersInTheStringIgnoringSpecialSymbolsTestV3() {
        String numbers = "//[;][&]\n1;2&3";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 6);
    }
}