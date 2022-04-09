package student_yevgeniy_tolks.lesson_7.lessoncode;

public class ArrayDemo {
    public static void main(String[] args) {

        Array array = new Array();
        int [] arr = array.createArray(3);
        array.fillArray(arr);
        array.printArrayValuesOnConsole(arr);
    }
}
