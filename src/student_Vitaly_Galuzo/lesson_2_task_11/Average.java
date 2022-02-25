package student_Vitaly_Galuzo.lesson_2_task_11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

            Scanner scr=new Scanner(System.in);
        System.out.println("Input first number:");
        double one= scr.nextDouble();
        double two= scr.nextDouble();
        double three= scr.nextDouble();
        double sum= ((one+two+three)/3);
        System.out.println("("+one+" + "+two+" + "+three+")"+" / "+"3"+" = "+sum );



    }
}
