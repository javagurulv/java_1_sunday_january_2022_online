package student_yevgeniy_tolks.lesson_9.level_6.task30;

class VarArgsExampleDemo {
    public static void main(String[] args) {
        VarArgsExample varArgsExample = new VarArgsExample();
        int sumOfNumber = varArgsExample.sumNumbers(1,2,3,4,5,6,7,8,9,0);
        System.out.println(sumOfNumber);
    }
}
