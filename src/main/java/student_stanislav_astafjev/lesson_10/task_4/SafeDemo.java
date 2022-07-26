package student_stanislav_astafjev.lesson_10.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(3993, 168.18);
        String pass = safe.pass;
        System.out.println("Password - " + pass);
        double safeMoney = safe.moneyAmountInSafe;
        System.out.println("Money inside - " + safeMoney);


    }
}
