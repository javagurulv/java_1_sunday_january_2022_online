package student_devids_kropacovs.lesson5.level4;

public class Task28 {
    public static void main(String[] args) {

        int [] numbers = new int[(int) (Math.random() * 10 + 1)];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10 +1);
        }
        int smallestNumber = numbers[0];

        for ( int i = 0; i< numbers.length; i++){
            System.out.println("Number " + (i+1) + " of an array is " + numbers[i]);
            if (numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
            }
        }
        System.out.println("Biggest numebr from an array is " + smallestNumber);
    }
}
