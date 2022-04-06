package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_18_19_20;

import java.util.Scanner;

public class ForInfiniteLoop {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i--) {
            System.out.println("Infinity");

            if (i == -1) {
                break;
            }
        }

        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter your pass number");
            String passNumb = scan.nextLine();
            break;
        }


        }
    }
