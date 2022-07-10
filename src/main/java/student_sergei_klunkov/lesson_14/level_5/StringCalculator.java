package student_sergei_klunkov.lesson_14.level_5;

class StringCalculator {

    int add(String numbers) {
        int sumOfString = 0;
        String filterNumbers = numbers.replaceAll("[[;][&],a-zA-Z\n\\[\\]/]", "");
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
