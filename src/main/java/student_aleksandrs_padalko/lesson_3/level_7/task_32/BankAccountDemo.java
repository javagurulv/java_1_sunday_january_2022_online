package student_aleksandrs_padalko.lesson_3.level_7.task_32;

    class BankAccountDemo { public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(10, "Viktor");
    String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
    System.out.println("Owner = " + ownerFirstName);
    System.out.println("Money = " + moneyAmount);
}
}
