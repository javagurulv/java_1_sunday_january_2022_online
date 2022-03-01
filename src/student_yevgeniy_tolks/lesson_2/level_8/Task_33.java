package student_yevgeniy_tolks.lesson_2.level_8;
//test task with primitive data types

public class Task_33 {

//instance variables (non-static fields), object store their individual states
    int numInt=1;
    double numDouble=2;
    char aChar='A';
//non-initialized 8 primitive class variables (static fields)
    static byte b;
    static int a;
    static short s;
    static long l;
    static double d;
    static float f;
    static boolean bool;
    static char ch;
//from here our app starts to run
    public static void main(String[] args) {
//primitive data type local variables, visible only inside method, should
        int i =100;
        double j = 100;
/*
Without class Task_33 object creation, values of instance variables won't
be visible inside main method following by compiler error message
 */
        Task_33 task = new Task_33();

        int num1=task.numInt;
        double num2= task.numDouble;
        char ch1= task.aChar;

//printing local variable values
        System.out.println(i +" " + j);
        System.out.println();
//printing in the console instance variables values
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(ch1);
        System.out.println();
//printing in the console class variables to see default values in JAVA
        System.out.println(b);
        System.out.println(a);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bool);
        System.out.println(ch);
    }
}
