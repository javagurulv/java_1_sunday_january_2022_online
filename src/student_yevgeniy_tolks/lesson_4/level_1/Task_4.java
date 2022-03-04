package student_yevgeniy_tolks.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println(number + " is even number");
        }
        else{
            System.out.println(number + " is odd number");
        }

    }
}
