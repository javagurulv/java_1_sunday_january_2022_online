package student_sergei_klunkov.lesson_2.level_3;

import java.util.Scanner;


        // Запросить у пользователя целое число

        // Показать таблицу умножения для этого числа до 10

        public class MultiplicationTable {


            public static void main(String[] args) {

                System.out.println("Введите число и получите его таблицу умножения");
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();


                for(int i=1; i<=10; ++i)

                    System.out.println(n + " * " + i + " = " + i * n);






            }


            }
