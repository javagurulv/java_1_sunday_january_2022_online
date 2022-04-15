package student_yevgeniy_tolks.lesson_7.level_6.task11;

class Palindrome {

    public boolean isPalindrome(String text) {

        String someText = text.toLowerCase();
        String[] palindromeText = someText.split("");

        StringBuilder reverseText = new StringBuilder();
        for (int j = palindromeText.length - 1; j >= 0; j--) {
            reverseText.append(palindromeText[j]);
        }
        return reverseText.toString().equals(someText);
    }
}
