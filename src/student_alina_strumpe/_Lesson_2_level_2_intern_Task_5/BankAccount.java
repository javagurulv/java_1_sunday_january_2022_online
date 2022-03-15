package student_alina_strumpe._Lesson_2_level_2_intern_Task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankAccount{

    public static void main(String [] arg) {


        double bankAcc_1 = 890.11;
        double bankAcc_2 = 321.10;
        int bankAcc_3 = 105;
        int bankAcc_4 = 1050;
        double sum ;
        double result = minFunction(bankAcc_1, bankAcc_2);
        int result1 = minFunction(bankAcc_3, bankAcc_4);

                            sum = (double)(bankAcc_1 +bankAcc_2 + bankAcc_3 + bankAcc_4);
            System.out.println("Bank accounts total: "+sum);
            System.out.println("Min value = " + result);
            System.out.println("Min value = " + result1);



        }
    public static double minFunction(double bankAcc_1, double bankAcc_2){
        double min;
        if (bankAcc_1 > bankAcc_2)
            min = bankAcc_2;
                else
            min = bankAcc_1;

        return min;
    }
    public static int minFunction(int bankAcc_3, int bankAcc_4){
        int min;
        if (bankAcc_3 > bankAcc_4)
            min = bankAcc_4;
        else
            min = bankAcc_3;

        return min;
    }

    }

