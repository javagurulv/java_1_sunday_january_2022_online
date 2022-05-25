package student_anna_zhoydik.lesson_4.task_2;

import java.util.Scanner;

public class InsertNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert number: ");
    int number= scanner.nextInt();
    if(number<0){
      System.out.println("Number is negative");
    }
    else if(number>0){
      System.out.println("Number is positive");
    }else if(number==0){
      System.out.println("Number equal 0");
    }
  }
}
