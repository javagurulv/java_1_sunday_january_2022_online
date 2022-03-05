package student_anna_zhoydik.lesson_3.level_7.task_32;

class BankAccount {

  String owner;
  int money;

  BankAccount(int moneyAmount,String owner) {
    this.owner = owner;
    this.money=moneyAmount;
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
    BankAccount bankAccount = new BankAccount(100000, "Victor");
    String ownerFirstName = bankAccount.getOwner();
    int moneyAmount = bankAccount.getMoney();
    System.out.println("Owner = " + ownerFirstName);
    System.out.println("Money = " + moneyAmount);
  }

}
