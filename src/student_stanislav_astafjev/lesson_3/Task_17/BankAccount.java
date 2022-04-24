package student_stanislav_astafjev.lesson_3.Task_17;

public class BankAccount {
    String ownerFirstName;
    String ownerSecondName;
    int moneyAmount;
    BankAccount(String ownerFirstName,String ownerSecondName,int moneyAmount){
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
        this.moneyAmount = moneyAmount;
    }
    String getOwnerFirstName(){
        return this.ownerFirstName;
    }
    String getOwnerSecondName(){
        return this.ownerSecondName;
    }
    int getMoneyAmount(){
        return this.moneyAmount;
    }
}
