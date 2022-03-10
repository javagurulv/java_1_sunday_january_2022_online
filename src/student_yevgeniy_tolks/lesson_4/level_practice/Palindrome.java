package student_yevgeniy_tolks.lesson_4.level_practice;

public class Palindrome {

        int r;
        int sum;

        public boolean palindromeNumber(int n,int temp) {

            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                return true;
            } else {
                return false;
            }
        }

}
