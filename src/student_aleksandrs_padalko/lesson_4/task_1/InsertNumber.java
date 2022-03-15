package student_aleksandrs_padalko.lesson_4.task_1;



import java.util.Scanner;

class InsertNumber { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert the number you want to check:");

    int number = sc.nextInt();
    if(number > 0)
     {System.out.println(number+" is positive number");      }

    else if(number < 0) {System.out.println(number + " is negative number");
    }

}}

