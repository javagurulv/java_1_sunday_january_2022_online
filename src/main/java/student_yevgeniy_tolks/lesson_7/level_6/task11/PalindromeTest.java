package student_yevgeniy_tolks.lesson_7.level_6.task11;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest PalindromeTest = new PalindromeTest();
        PalindromeTest.textIsPalindromeTest();
        PalindromeTest.textIsNotPalindromeTest();
    }

    public void textIsPalindromeTest() {

        String isPalindromeText = "MuhaHum";

        Palindrome palindrome = new Palindrome();
        boolean expectPalindrome = palindrome.isPalindrome(isPalindromeText);
        if (expectPalindrome) {
            System.out.println("Text is palindrome - Test OK");
        } else {
            System.out.println("Text is not palindrome - Test FAILED");
        }
    }

    public void textIsNotPalindromeTest() {

        String isPalindromeText = "muhahuMa";

        Palindrome palindrome = new Palindrome();
        boolean expectPalindrome = palindrome.isPalindrome(isPalindromeText);
        if (!expectPalindrome) {
            System.out.println("Text is not palindrome - Test OK");
        } else {
            System.out.println("Text is palindrome - Test FAILED");
        }
    }
}

