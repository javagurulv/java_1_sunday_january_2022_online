package student_elina_kucenko.lesson6.level4.task20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
