package student_sergei_klunkov.lesson_7.level_6;



class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isEvenWordPalindromeTest();
        test.isOddWordPalindromeTest();
        test.isPalindromeWordWithUpperCaseTest();
        test.notPalindromeWordTest();


    }


    public void isEvenWordPalindromeTest(){

        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome("abba")){
            System.out.println("Word is even length palindrome! TEST PASSED!!!");
        } else {
            System.out.println("Word is not even length palindrome! TEST FAILED!!!");
        }
    }

    public void isOddWordPalindromeTest(){

        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome("civic")){
            System.out.println("Word is odd length palindrome! TEST PASSED!!!");
        } else {
            System.out.println("Word is not odd length palindrome! TEST FAILED!!!");
        }
    }

    public void isPalindromeWordWithUpperCaseTest(){

        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome("kaYAk")) {
            System.out.println("Palindrome word with upper case is ignored! TEST PASSED!!!");
        } else {
            System.out.println("Palindrome word with upper case is not ignored! TEST FAILED!!!");
        }
    }

    public void notPalindromeWordTest() {

        Palindrome palindrome = new Palindrome();
        if(!palindrome.isPalindrome("civics")) {
            System.out.println("Word is not palindrome! TEST PASSED!!!");
        } else {
            System.out.println("Word is palindrome! TEST FAILED!!!");
        }
    }
}
