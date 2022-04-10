package student_elina_kucenko.lesson7.level6;

class CredCard {


    private String cardNumber;
    private String pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;

    CredCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public boolean isPinOK(String pinCode) {
        return this.pinCode == pinCode;
    }

    public boolean depositMoney(int depositAmount, String pinCode) {
        if (isPinOK(pinCode)) {
            if (creditDebt > 0) {
                if (depositAmount <= creditDebt) {
                    creditDebt = creditDebt - depositAmount;
                } else {
                    balance = depositAmount - creditDebt;
                    creditDebt = 0;
                }
                return true;
            }
        }
        return false;
    }


    public boolean withdrawMoney(int withdrawAmount, String pinCode) {
        if (isPinOK(pinCode)) {
            if (balance >= withdrawAmount) {
                balance = balance - withdrawAmount;
                return true;
            } else {
                int creditAmount = (balance - withdrawAmount) * -1;
                if (creditAmount <= creditLimit) {
                    balance = 0;
                    creditDebt = creditAmount;
                    return true;
                }
            }
        }
        return false;
    }


    public int getBalance() {
        return balance;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}



