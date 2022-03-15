package student_devids_kropacovs.lesson_4.level_1;

import java.util.Scanner;

 class Task_3 {
    public static void main(String[] args) {

        System.out.print("Please, enter a number from 1 to 7: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        while(x<1 || x>7){
            System.out.print("Number needs to be from 1 to 7: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
        if (x == 1){
            System.out.println("Monday");
        }else if (x == 2){
            System.out.println("Tuesday");
        }else if(x == 3){
            System.out.println("Wednesday");
        }else if(x == 4){
            System.out.println("Thursday");
        }else if(x == 5){
            System.out.println("Friday");
        }else if (x == 6){
            System.out.println("Saturday");
        }else if(x == 7){
            System.out.println("Sunday");
        }

    }
}
