package student_vladislavs_boicenko.lesson_2;

        import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scan.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 / num2;
        int res4 = num1 * num2;
        System.out.println("Результат: ");
        System.out.println(num1 + "+" + num2 + "=" + res1);
        System.out.println(num1 + "-" + num2 + "=" + res2);
        System.out.println(num1 + "/" + num2 + "=" + res3);
        System.out.println(num1 + "*" + num2 + "=" + res4);

    }

}
