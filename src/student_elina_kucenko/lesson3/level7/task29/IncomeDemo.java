package student_elina_kucenko.lesson3.level7.task29;

import java.util.Scanner;

public class IncomeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.next();

        System.out.println("Please enter your income:");
        int income = scanner.nextInt();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        Income personsData = new Income(name, income, age);
        int incomeNetto = personsData.calculateNetoIncome();
        personsData.CitizenshipYes();
        boolean citizenship=personsData.giveCitizenship();
        System.out.println("Your name is "+name+", you are "+age+" years old, your income before taxes is "+income+" euro, but after taxes "+incomeNetto+" euro. Your citizenship status now is "+citizenship);

    }

}
