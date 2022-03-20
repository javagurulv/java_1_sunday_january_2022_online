package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_4_junior;

class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    double moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                double moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    double getMoneyAmount() {
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Deniss", "Dubko", 999999.99);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        double moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name: " + ownerFirstName);
        System.out.println("Owner last name: " + ownerLastName);
        System.out.println("Money amount: " + moneyAmount);
    }


}