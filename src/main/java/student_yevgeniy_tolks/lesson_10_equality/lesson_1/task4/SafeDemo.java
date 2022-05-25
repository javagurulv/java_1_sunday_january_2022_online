package student_yevgeniy_tolks.lesson_10_equality.lesson_1.task4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("1111", 10000);
        String password = safe.password;
        System.out.println(password);

        int moneyInSafe = safe.moneyAmountInSafe;
        System.out.println(moneyInSafe);
    }
}
