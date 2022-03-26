package student_elina_kucenko.lesson6.level4.task19;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            System.out.println("Running infinite for loop...");
            break;
        }
    }
}
