package student_elina_kucenko.lesson2.level1;

 /*Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.

1. Создать класс с нужным именем; 2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in); int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).*/

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 1st number");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter 2nd number");
        int secondNumber = scanner.nextInt();
        int result1 = firstNumber+secondNumber;
        int result2 = firstNumber-secondNumber;
        int result3 = firstNumber*secondNumber;
        double result4 = firstNumber/(double)secondNumber;

        System.out.println(firstNumber +"+"+ secondNumber +"=" + result1);
        System.out.println(firstNumber +"-"+ secondNumber +"=" + result2);
        System.out.println(firstNumber +"*"+ secondNumber +"=" + result3);
        System.out.println(firstNumber +"/"+ secondNumber +"=" + result4);

    }
}
