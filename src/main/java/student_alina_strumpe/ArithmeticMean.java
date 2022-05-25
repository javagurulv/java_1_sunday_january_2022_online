package student_alina_strumpe;

import java.util.Scanner;

public class ArithmeticMean {



        public static void main(String[] args){


                      Scanner scan = new Scanner(System.in);
                  System.out.print("Enter 3 Numbers : ");
                 int a1 = scan.nextInt();
                 int b1 = scan.nextInt();
                 int c1 = scan.nextInt();
                 int i, sum =0;
                 int []mas2 = {a1,b1,c1};
                 for(i=0; i< mas2.length; i++){
                     sum += mas2[i];
                   }
                 double mean;
                 mean = sum/(double) mas2.length;

                 System.out.print(sum);
                 System.out.print("Arithmetic Mean = " + mean);


        /*         kontakt s polzotel - metod
           Scanner scan = new Scanner(System.in);
            System.out.println("Insert three integers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int sum =0;    //  nachalnoe znachenie
            int mas1[] = {a,b,c};   //pomestili znachenija a,b,c v i
            for (int i=0; i < mas1.length; i++){
                sum +=mas1[i];            //  prosto i => kol-vo elementov  massiva
            }
            System.out.println(sum);
            double mean;
            mean = sum/(double)mas1.length;
            System.out.println(" Average: "+ mean);
   */






        }

    }



