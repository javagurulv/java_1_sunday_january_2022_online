package student_anna_zhoydik.lesson_4.task_9;

import java.util.Scanner;

public class Exersize {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Input first number: ");
      double x = in.nextDouble();
      System.out.print("Input second number: ");
      double y = in.nextDouble();
      System.out.print("Input third number: ");
      double z = in.nextDouble();
      if (x < y && y < z)
      {
        System.out.println("Increasing order");
      }
      else if (x > y && y > z)
      {
        System.out.println("Decreasing order");
      }
      else
      {
        System.out.println("Neither increasing or decreasing order");
      }
    }
  }

