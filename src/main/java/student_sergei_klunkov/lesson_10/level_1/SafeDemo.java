package student_sergei_klunkov.lesson_10.level_1;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe("1234", 150);

        String password = safe.password;
        System.out.println(password);

        int moneyInSafe = safe.moneyAmountInSafe;
        System.out.println(moneyInSafe);
    }

}
