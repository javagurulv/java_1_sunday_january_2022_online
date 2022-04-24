package student_stanislav_astafjev.lesson_3.Task_32;

class BankAccount {
    String owner;
    int money;
    BankAccount(String owner,int money){
        this.owner = owner;
        this.money = money;
    }
    public String getOwner(){
        return this.owner;
    }
    public int getMoney(){
        return this.money;
    }
}
