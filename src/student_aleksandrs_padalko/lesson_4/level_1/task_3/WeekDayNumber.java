package student_aleksandrs_padalko.lesson_4.level_1.task_3;

import java.util.Scanner;

class WeekDayNumber {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert day of the week:");

    int number = sc.nextInt();
    if(number ==1)
    {System.out.println(" monday");      }

    if(number ==2) {System.out.println(" tuesday");
    }
    if(number == 3) {System.out.println(" wednesday");}
    if(number == 4) {System.out.println(" thursday");}
    if(number == 5) {System.out.println(  " friday");}
    if(number == 6) {System.out.println( " saturday");}
    if(number == 7) {System.out.println( " sunday");}
}
}
