package student_jelena_voinica;

import java.util.Scanner;

public class lesson_1_Multiply {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstnumber");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter secondnumber");
        int secondNumber = scanner.nextInt();

        int multiplu = firstNumber * secondNumber;

        System.out.println( "Multiplu = " + multiplu );

    }
}
