package student_alina_strumpe._lesson_3._level_7_senior_Task_29;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert income amount: ");
        double brMonthIncome = scan.nextDouble();

        Calculator incomeCalculator = new Calculator(brMonthIncome);



        double taxMonthTax1 = incomeCalculator.calculateTax1();
        System.out.println(taxMonthTax1);
        double taxMonthTax2 = incomeCalculator.calculateTax2();
        System.out.println(taxMonthTax2);
        double ntMontIncome = incomeCalculator.calculateNtMonthIncome();
        System.out.println(ntMontIncome);


    }
}
