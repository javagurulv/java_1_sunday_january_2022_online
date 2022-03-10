package student_yevgeniy_tolks.lesson_4.level_practice;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.checkForPalindromeNumber();
    }

    public void checkForPalindromeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int temp = n;

        Palindrome palindrome=new Palindrome();

        boolean palindromeNumberResult = palindrome.palindromeNumber(n,temp);
        if (palindromeNumberResult) {
            System.out.println(" number is palindrome - test OK");
        }
        else {
            System.out.println(" number is not palindrome - test FAILED");
        }
    }
}
