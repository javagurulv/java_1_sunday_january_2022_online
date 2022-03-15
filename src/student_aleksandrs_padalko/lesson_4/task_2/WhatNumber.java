package student_aleksandrs_padalko.lesson_4.task_2;

import java.util.Scanner;

public class WhatNumber { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert the number you want to check:");

    int number = sc.nextInt();
    if(number > 0)
    {System.out.println(number+" is positive number");      }

    else if(number < 0) {System.out.println(number + " is negative number");
    }
     else if(number == 0) {System.out.println(number + " is equal to zero");}
}}

