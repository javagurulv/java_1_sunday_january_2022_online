package student_devids_kropacovs.lesson5.level2.task13;

public class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sumOfArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " from arrays is " + numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            sumOfArray = sumOfArray + numbers[i];
        }
        System.out.print("Sum of the array is: " + sumOfArray);
    }
}
