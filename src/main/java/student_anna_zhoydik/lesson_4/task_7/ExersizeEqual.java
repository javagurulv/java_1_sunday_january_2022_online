package student_anna_zhoydik.lesson_4.task_7;

import java.util.Scanner;

public class ExersizeEqual {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = scanner.nextInt();
    System.out.println("Enter second number");
    int b = scanner.nextInt();
    if(a==b){
      System.out.println("numbers are equal");
    }else{
      System.out.println("numbers are different");
    }
  }
}
