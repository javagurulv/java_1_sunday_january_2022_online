package student_yevgeniy_tolks.lesson_7.level_6.task10;

class CreditCard {

    private long cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;
    private double moneyAmount;

    public CreditCard(long cardNumber, int pinCode, double creditLimit) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.creditLimit = creditLimit;
        this.balance = 0;
        this.loanDebt = 0;
        this.moneyAmount = 0;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public boolean depositMoney() {
        if (this.pinCode == getPinCode()) {
            this.balance += getMoneyAmount() + this.creditLimit;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawMoney() {
        if (this.pinCode == getPinCode() && this.creditLimit >= getMoneyAmount()) {
            this.balance -= getMoneyAmount() + this.creditLimit;
            return true;
        } else {
            return false;
        }
    }

    public void printBalanceOnConsole() {
        System.out.println("Account balance = " + this.balance);
    }

}

