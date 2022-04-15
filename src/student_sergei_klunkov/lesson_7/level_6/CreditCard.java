package student_sergei_klunkov.lesson_7.level_6;

class CreditCard {

    private String cardNumber;
    private int cardPinCode;
    private int cardBalance;
    private int cardCreditLimit;
    private int cardCreditDebt;

    CreditCard(int cardPinCode, String cardNumber) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
    }

    public boolean isPinCodeCorrect(int cardPinCode) {
        return this.cardPinCode == cardPinCode;
    }


    public boolean creditCardWithdraw(int moneyToWithdraw, int cardPinCode) {
        if (isPinCodeCorrect(cardPinCode)) {
            if (cardBalance >= moneyToWithdraw){
                cardBalance = cardBalance - moneyToWithdraw;
                return true;
            } else {
                int creditSum = (cardBalance - moneyToWithdraw)* -1;
                if (creditSum <= cardCreditLimit) {
                    cardBalance = 0;
                    cardCreditDebt = creditSum;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean creditCardDeposit(int moneyToDeposit, int cardPinCode) {
        if (isPinCodeCorrect(cardPinCode)){
            if (cardCreditDebt > 0) {
                if (moneyToDeposit <= cardCreditDebt){
                    cardCreditDebt = cardCreditDebt - moneyToDeposit;
                } else {
                    cardBalance = moneyToDeposit - cardCreditDebt;
                    cardCreditDebt = 0;
                }
                return true;

            }
        }
        return false;
    }

    public int getCardBalance(){
        return cardBalance;
    }

    public int getCardCreditDebt() { return cardCreditDebt;}

    public void setCardBalance(int cardBalance){
        this.cardBalance = cardBalance;
    }

    public void setCardCreditDebt(int cardCreditDebt) {
        this.cardCreditDebt = cardCreditDebt;
    }

    public void setCardCreditLimit(int cardCreditLimit){
        this.cardCreditLimit = cardCreditLimit;
    }





}


