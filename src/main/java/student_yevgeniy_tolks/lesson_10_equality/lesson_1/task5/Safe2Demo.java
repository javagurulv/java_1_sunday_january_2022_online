package student_yevgeniy_tolks.lesson_10_equality.lesson_1.task5;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2("1111", 10000);
        int putMoney = safe2.putMoneyAmountInSafe("1111", 1231);
        System.out.println("Deposited money amount = " + putMoney
                + "\nBalance of safe = " + safe2.getSafeBalance());
        System.out.println();
        int getMoney = safe2.getMoneyAmountInSafe("1111", 1001);
        System.out.println("Money amount withdrawn = " + getMoney
                + "\nBalance of safe = " + safe2.getSafeBalance());

    }
}
