package student_stanislav_astafjev.lesson_5.lesson;

public class ArrayExample {
    public static void main(String[] args) {

        int [] marks = new int[4];
        marks[0] = 9;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 8;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        int sum = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println(sum);

        System.out.println("Array length " + marks.length);

        marks[0] = 65;
        marks[1] = 44;
        marks[2] = 112;
        marks[3] = 42;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

    }
}
