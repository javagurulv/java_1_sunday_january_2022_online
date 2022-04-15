package student_devids_kropacovs.lesson7.task11;


class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest();
    }

    public void isPalindromeTest(){
        Palindrome palindrome = new Palindrome();
        String text = "sum summus mus";
        boolean expectedResult = true;
        boolean realResult = palindrome.isPalindrome(text);
        if(expectedResult == realResult){
            System.out.println("Is palindrome test PASS");
        }else{
            System.out.println("Is palindrome test FAIL");
        }
    }


}
