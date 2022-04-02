package student_sergei_klunkov.lesson_6.level_4;

class ForInfiniteLoopContinue {

    public static void main(String[] args) {
        for(int i = 0; i < 15; i++){
            if(i == 5){
                continue;
            }
            System.out.println(" i = " + i);

        }
    }
}
