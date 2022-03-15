package student_aleksandrs_padalko.lesson_4.task_4;

import java.util.Scanner;

class OddOrEvenNumber {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert the number you want to check:");

    int number = sc.nextInt();
    if(number%2 == 0 )
    {System.out.println(number+" is even number");      }

    else  {System.out.println(number + " is odd number");
    }

}}

