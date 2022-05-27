package student_yevgeniy_tolks.lesson_14_JUnit.level5.task26_29;

class StringCalculator {

    int add(String numbers) {
        int sumOfString = 0;
        String filterNumbers = numbers.replaceAll("[,a-zA-Z ]", "");
        String[] number = filterNumbers.split("");
        for (int i = 0; i < filterNumbers.length(); i++) {
            if (number.length == 1 && number[i].equals("")) {
                return 0;
            } else {
                sumOfString = sumOfString + Integer.parseInt(number[i]);
            }
        }
        return sumOfString;
    }
}
