package student_devids_kropacovs.lesson5.level2.task12;

public class Task12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000 + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " from arrays is " + numbers[i]);
        }
    }
}
