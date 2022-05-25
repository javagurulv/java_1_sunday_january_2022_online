package student_devids_kropacovs.lesson3.level_7.task_32;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.money = moneyAmount;
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

