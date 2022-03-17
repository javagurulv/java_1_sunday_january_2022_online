package student_alina_strumpe._lesson_4_if._level_7_Task_22;

import java.util.Scanner;

public class FizzBuzzTest {

    public static void main(String[] args){


        FizzBuzz fizzBuzz = new FizzBuzz();
        String word = fizzBuzz.detect(5);
        System.out.println(word);

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1fizz();
        fizzBuzzTest.test2Buzz();
        fizzBuzzTest.test3FizzBuzz();
        fizzBuzzTest.test4Number();


    }


    public void test1fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
       int number = 1;
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(number);
        if (expectedResult == actualResult){
            System.out.println("Test 1 is OK");
        } else {
            System.out.println("TEST 1 is FAIL");
        }
    }

    public void test2Buzz(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 17;
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(number);
        if (expectedResult == actualResult){
            System.out.println("Test 2 is OK");
        } else {
            System.out.println("Test 2 is FAIL");
        }
    }

    public void test3FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(number);
        if (expectedResult == actualResult){
            System.out.println("Test 3 is OK");
        } else {
            System.out.println("Test 3 is FAIL");
        }
    }
    public void test4Number(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expectedResult ="null";
        String actualResult = fizzBuzz.detect(5);
        if (expectedResult == actualResult){
            System.out.println("Test 4 is OK");
        } else {
            System.out.println("Test 4 is FAIL");
        }
    }

}
