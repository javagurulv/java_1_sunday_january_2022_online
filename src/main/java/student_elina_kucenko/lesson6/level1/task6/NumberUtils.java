package student_elina_kucenko.lesson6.level1.task6;

class NumberUtils {

    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        System.out.println(numberUtils.isEven(6));
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
