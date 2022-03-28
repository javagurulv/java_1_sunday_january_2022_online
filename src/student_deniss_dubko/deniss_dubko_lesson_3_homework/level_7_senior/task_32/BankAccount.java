package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_32;

class BankAccount {

    /* Найти логическую ошибку в коде.
    Исправить и запустить программу так, что бы она выводила
    на консоль владельца банковского счёта и количество денег.
    Менять можно только класс BankAccount. */

    String ownerName;
    int moneyAmount;

    public BankAccount(String ownerName,
                       int moneyAmount) {

        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwner() {
        return this.ownerName;
    }

    public String getMoney() {
        return "" + this.moneyAmount;
    }


}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
