package student_elina_kucenko.lesson7.level6;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isEvenPalindromeTest();
        palindromeTest.isOddPalindromeTest();
        palindromeTest.isPalindromeWithUpperCaseTest();
        palindromeTest.notPalindromeTest();
    }


    public void isEvenPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("abba")) {
            System.out.println("Palindrome is even length Test - OK");
        } else {
            System.out.println("Palindrome is even length Test - Failed");
        }
    }

    public void isOddPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("level")) {
            System.out.println("Palindrome is Odd length -OK");
        } else {
            System.out.println("Palindrome is Odd length -Failed");
        }
    }

    public void isPalindromeWithUpperCaseTest() {
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome("leVEl")) {
            System.out.println("Palindrome cases are ignored - OK");
        } else {
            System.out.println("Palindrome cases are ignored - Failed");
        }
    }

    public void notPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        if (!palindrome.isPalindrome("levels")) {
            System.out.println("Text is not Palindrome -OK");
        } else {
            System.out.println("Text is not Palindrome-Failed");
        }
    }
}
