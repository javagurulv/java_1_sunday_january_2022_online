package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_1_intern_level_3_junior;

class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = wordService.writeSomeText();
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("The most frequent word in text: " + mostFrequentWord);
    }

}