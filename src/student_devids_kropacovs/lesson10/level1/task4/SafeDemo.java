package student_devids_kropacovs.lesson10.level1.task4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.amountInSafe = 100;
        safe.safeCode = 1234;
        safe.safeCode = 234231;
    }
}
