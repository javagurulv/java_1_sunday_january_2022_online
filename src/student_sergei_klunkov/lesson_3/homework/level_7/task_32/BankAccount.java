package student_sergei_klunkov.lesson_3.homework.level_7.task_32;

class BankAccount {

    String owner;
    String money;

    public BankAccount(String owner, String moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return this.money;
    }

}

