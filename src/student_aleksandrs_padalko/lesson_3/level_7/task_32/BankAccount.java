package student_aleksandrs_padalko.lesson_3.level_7.task_32;

 class BankAccount { String owner;
    int money;


     public BankAccount(int money, String owner) {
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
