package student_yevgeniy_tolks.lesson_9.level_6.task30;

class VarArgsExample {

    public int sumNumbers(int ... numbers){

        int sum = 0;
        for (int addNumber: numbers){
            sum += addNumber;
        }
        return sum;
    }
}
