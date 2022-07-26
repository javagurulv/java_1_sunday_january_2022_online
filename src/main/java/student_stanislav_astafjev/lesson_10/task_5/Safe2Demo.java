package student_stanislav_astafjev.lesson_10.task_5;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2("3993",149.38);
        double putMoneyInside = safe2.putMoneyAmountInSafe(Integer.parseInt("3993"),666.66);
        System.out.println("Put money amount inside = " + putMoneyInside);
        System.out.println("Money inside safe - " + safe2.moneyInsideSafe());

        double takeMoneyFromSafe = safe2.getMoneyAmountInSafe(Integer.parseInt("3993"),333.33);
        System.out.println("Take money amount " + takeMoneyFromSafe);
        System.out.println("Money inside safe - " + safe2.moneyInsideSafe());

    }
}
