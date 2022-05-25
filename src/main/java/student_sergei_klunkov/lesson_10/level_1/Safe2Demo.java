package student_sergei_klunkov.lesson_10.level_1;

class Safe2Demo {

    public static void main(String[] args) {

        Safe_2 safe_2 = new Safe_2("4444", 1000);

        int putMoney = safe_2.putMoneyAmountInSafe("4444", 1000);
        System.out.println("Deposit money amount: " + putMoney + " \nBalance in safe: " + safe_2.getSafeBalance());
        System.out.println();

        int getMoney = safe_2.getMoneyInSafe("4444", 500);
        System.out.println("Withdraw money amount: " + getMoney + "\nBalance in safe after withdraw: " + safe_2.getSafeBalance());
        System.out.println();
    }

}
