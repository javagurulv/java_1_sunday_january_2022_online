package student_sergei_klunkov.lesson_6.level_4;

class WhileInfiniteLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            if (i == 4){
                continue;
            }
            System.out.println("i = " + i);
            i++;

        }
    }
}
