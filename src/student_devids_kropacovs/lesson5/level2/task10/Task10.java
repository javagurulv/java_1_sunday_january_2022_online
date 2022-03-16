package student_devids_kropacovs.lesson5.level2.task10;

public class Task10 {
    public static void main(String[] args) {
        int[]numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 3;

        for(int i = 0; i<numbers.length; i++){
            System.out.println("Number "+ (i+1) + " from arrays is "+ numbers[i]);
        }
    }
}
