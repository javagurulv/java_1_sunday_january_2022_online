package student_yevgeniy_tolks.lesson_5.level_1;

class Task_7_ArrayLength1 {

    public static void main(String[] args) {
        int [] numbers = new int[2];    // [] missing in array declaration
        System.out.println(numbers[0]);  //numbers[-1] out of boundary, indexing always with 0
    }
}
