package student_yevgeniy_tolks.lesson_14_JUnit.level5.task26_29;

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
    public void sumWithInfiniteAmountOfNumbersInStringTest() {
        String numbers = "2,6,4,5,7,3,2";
        int expectedResult = stringCalculator.add(numbers);
        assertEquals(expectedResult, 29);
    }
}