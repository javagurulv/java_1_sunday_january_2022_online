package student_yevgeniy_tolks.lesson_3.level_7;

//Task 32 - correct and run the programm
class BankAccount {
    String owner;
    int money;

    BankAccount(String owner,int moneyAmount) {
        this.owner=owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
