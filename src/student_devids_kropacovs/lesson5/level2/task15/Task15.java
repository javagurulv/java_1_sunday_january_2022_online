package student_devids_kropacovs.lesson5.level2.task15;

public class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10 +1);
        }
        for (int i = 0; i< numbers.length; i++){
            System.out.println("Number "+ (i+1) + " from arrays is "+ numbers[i]);
        }
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = numbers[i] + 2;
        }
        for (int i = 0; i< numbers.length; i++){
            System.out.println("Number "+ (i+1) + " from arrays is "+ numbers[i]);
        }

    }
}
