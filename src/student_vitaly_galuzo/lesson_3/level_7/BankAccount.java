package student_vitaly_galuzo.lesson_3.level_7;

public class BankAccount {

    String owner;
    int money;

    BankAccount(int money,String owner) {
        this.owner = owner;
        this.money = money;
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

        BankAccount bankAccount = new BankAccount(100000,"Viktor");

        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }



}
