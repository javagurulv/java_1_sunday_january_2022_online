package student_devids_kropacovs.lesson5.level4;

public class Task29 {

    public static void main(String[] args) {

        int [] numbers = new int[(int) (Math.random() * 10 + 1)];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10 +1);
        }

        for ( int i = 0; i< numbers.length; i++){
            System.out.println("Number " + (i+1) + " of an array is " + numbers[i]);
            }
        System.out.println("All even numbers are: ");
        for ( int i = 0; i< numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
        }

        }
    }
}
