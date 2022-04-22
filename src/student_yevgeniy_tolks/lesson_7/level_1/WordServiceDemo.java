package student_yevgeniy_tolks.lesson_7.level_1;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String someWord = wordService.findMostFrequentWords("mom mom dad");
        System.out.print("First word by max frequency met in text: \n"
                + someWord);
    }
}
