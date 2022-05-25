package student_sergei_klunkov.lesson_7.level_6;



class Palindrome {

    boolean isPalindrome(String text){
        String textToLower = text.toLowerCase();
        char[] chars = textToLower.toCharArray();
        for (int i = 0; i < text.length() / 2; i++){
            if ( chars[i] != chars[chars.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
