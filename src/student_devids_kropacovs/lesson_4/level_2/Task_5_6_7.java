package student_devids_kropacovs.lesson_4.level_2;

import java.util.Scanner;

 class Task_5_6_7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please, enter number 1: ");
        int x = s.nextInt();
        System.out.print("Please, enter number 2: ");
        int y = s.nextInt();

        if (x - y <0){
            System.out.println("2nd number is higher");
            System.out.println("Numbers are not equal");
        }else if(x - y > 0){
            System.out.println("1st number is higher");
            System.out.println("Numbers are not equal");
        }else {
            System.out.println("Numbers are equal");
        }


    }
}
