package student_anna_zhoydik.lesson_4.task_3;

import java.util.Scanner;

public class Week {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Insert number from 1 to 7: ");
    int number=scanner.nextInt();
    if(number==1){
      System.out.println("Monday");
    }
    if(number==2){
      System.out.println("Tuesday");
    }
    if(number==3){
      System.out.println("Wednesday");
    }
    if(number==4){
      System.out.println("Thursday");
    }
    if(number==5){
      System.out.println("Friday");
    }
    if(number==6){
      System.out.println("Saturday");
    }
    if(number==7){
      System.out.println("Sunday");
    }
  }
}
