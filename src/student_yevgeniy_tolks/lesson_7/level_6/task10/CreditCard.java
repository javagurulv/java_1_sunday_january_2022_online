package student_yevgeniy_tolks.lesson_7.level_6.task10;

class CreditCard {

    private long cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;
    private double moneyAmount;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.creditLimit =0;
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
            this.balance += getMoneyAmount() ;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawMoney() {
        if (this.pinCode == getPinCode() && this.creditLimit >= getMoneyAmount()) {
            this.balance -= getMoneyAmount();
            return true;
        } else {
            return false;
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public boolean cardIsCreated(CreditCard newCreditCard) {
        if (newCreditCard != null) {
            this.creditLimit = getCreditLimit();
            return true;
        } else {
            return false;
        }
    }

    public void printBalanceOnConsole() {
        double accountCredit = this.balance + this.creditLimit;
        System.out.println("ACCOUNT BALANCE = " + accountCredit);
        System.out.println("Credit Limit = " + this.creditLimit);
    }

}

