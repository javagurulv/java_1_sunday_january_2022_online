package student_alina_strumpe._lesson_3._level_2_intern._Task_17;
class BankAccount {

    private String ownerFirstName;
    private String ownerSecondName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerSecondName, int moneyAmount){
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
        this.moneyAmount = moneyAmount;
    }
    public String getOwnerFirstName(){
        return  this.ownerFirstName;
    }
    public String getOwnerSecondName(){
        return this.ownerSecondName;
    }
    public int getMoneyAmount(){
        return this.moneyAmount;
    }
}
