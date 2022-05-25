package student_devids_kropacovs.lesson7.task11;

import java.util.Arrays;

class Palindrome {


    public boolean isPalindrome(String text) {

        String temp = text.toLowerCase();
        String changedText = temp.replace(" ", "");
        System.out.println(text);
        char[] charArray = changedText.toCharArray();
        int n = charArray.length;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                if (charArray[i] != charArray[n - i - 1]) {
                    return false;
                }
            }
            return true;
        }else{
            for (int i = 0; i < (n-1) / 2; i++) {
                if (charArray[i] != charArray[n - i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

}
