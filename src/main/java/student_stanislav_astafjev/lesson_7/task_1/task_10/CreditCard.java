package student_stanislav_astafjev.lesson_7.task_1.task_10;


public class CreditCard {

    public int cardNumber;
    public int cardCode;
    public int balance;
    public int creditLimit;
    public int loanDebt;

    private CreditCard(int cardNumber,int cardCode) {
        this.cardNumber = cardNumber;
        this.cardCode = cardCode;
        this.creditLimit = 300;
        this.balance = 243;
        this.loanDebt = 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCardCode() {
        return cardCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public boolean depositMoney (int cardCode,int moneyDeposit) {
        if(cardCode == getCardCode() && moneyDeposit >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean balance(int cardCode,int moneyAmountDrawMoney,int creditLimit) {
        if((this.cardCode == cardCode && creditLimit >= moneyAmountDrawMoney && moneyAmountDrawMoney >= 1)) {
            this.balance -= moneyAmountDrawMoney;
            return true;
        } else {
            return false;
        }
    }

}

