package student_sergei_klunkov.lesson_5.lessoncode;


import java.util.Random;

class AverageMark {

    public static void main(String[] args) {

        int[] marks = new int[10];

        Random random = new Random();

        for (int i= 0; i < marks.length; i++) {
            int randomMark = random.nextInt(11);
            marks[i] = randomMark;
        }

        for (int i= 0; i < marks.length; i++) {
            System.out.println("Mark[" + i + "] = " + marks[i]);
        }


        int markSum = 0;
        for (int i= 0; i < marks.length; i++){
            markSum = markSum + marks[i];
        }

        double averageMark = (double) markSum / marks.length;

        System.out.println("Average = " + averageMark);
    }

}
