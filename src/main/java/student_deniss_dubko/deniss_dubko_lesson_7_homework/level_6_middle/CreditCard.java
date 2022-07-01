package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_6_middle;

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
        this.creditLimit = 1000;
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

    public boolean depositMoney(int pinCode, double moneyAmountToDeposit) {
        if (pinCode == getPinCode() && moneyAmountToDeposit >= 0.01) {
            this.balance += moneyAmountToDeposit;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawMoney(int pinCode, double moneyAmountToWithdraw, double creditLimit) {
        if (this.pinCode == pinCode && creditLimit >= moneyAmountToWithdraw && moneyAmountToWithdraw >= 0.01) {
            this.balance -= moneyAmountToWithdraw;
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

    public boolean accountHasDebt(double creditLimit) {
        if (accountBalance() < creditLimit) {
            this.balance = calculateDebt();
            return true;
        } else {
            return false;
        }
    }

    public double calculateDebt() {
        this.loanDebt = this.balance;
        return loanDebt;
    }

    public boolean accountHasNoDebt() {
        if (accountBalance() >= this.creditLimit) {
            this.loanDebt = calculateZeroDebt();
            return true;
        } else {
            return false;
        }
    }

    public double calculateZeroDebt() {
        this.loanDebt = 0;
        return loanDebt;
    }

    public double accountBalance() {
        return this.balance;
    }

    public double printAccountBalanceOnConsole() {
        return +accountBalance();
    }


}