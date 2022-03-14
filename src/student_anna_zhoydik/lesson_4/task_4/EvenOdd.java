package student_anna_zhoydik.lesson_4.task_4;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("Number is even");
    }else{
      System.out.println("Number is odd");
    }
    }
  }

