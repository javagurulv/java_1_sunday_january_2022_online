package student_aleksandra_jefimova.lesson_3.level_4.task_17;

class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;
    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }
    String getOwnerLastName() {
        return this.ownerLastName;
    }

   int getMoneyAmount() {
        return this.moneyAmount;
    }
}
