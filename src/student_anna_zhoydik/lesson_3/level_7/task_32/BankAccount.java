package student_anna_zhoydik.lesson_3.level_7.task_32;

class BankAccount {

  String owner;
  String money;

  BankAccount(String moneyAmount,String owner) {
    this.owner = owner;
    this.money=moneyAmount;
  }

  String getOwner() {
    return this.owner;
  }

  String getMoney() {
    return this.money;
  }

}

class BankAccountDemo {

  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("100000", "Victor");
    String ownerFirstName = bankAccount.getOwner();
   String moneyAmount = bankAccount.getMoney();
    System.out.println("Owner = " + ownerFirstName);
    System.out.println("Money = " + moneyAmount);
  }

}
