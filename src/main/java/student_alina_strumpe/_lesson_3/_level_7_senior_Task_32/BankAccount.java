package student_alina_strumpe._lesson_3._level_7_senior_Task_32;

class BankAccount {

    public String ownerFirstname;
    public int money;

    public BankAccount(String ownerFirstname, int money){
        this.ownerFirstname = ownerFirstname;
        this.money = money;
            }

            public String getOwner(){ return ownerFirstname; }

    public int getMoney(){ return money ;}
}

 class BankAccountDemo{
      public static void main(String[] args){

          BankAccount bankAccount = new BankAccount("Victor", 100000);
          String ownerFirstName = bankAccount.ownerFirstname;
          int moneyAmount = bankAccount.getMoney();

          System.out.println("Owner = "+ ownerFirstName);
          System.out.println("Money = "+moneyAmount);


      }

}