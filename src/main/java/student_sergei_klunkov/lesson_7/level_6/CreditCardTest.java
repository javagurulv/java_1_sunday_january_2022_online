package student_sergei_klunkov.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.moneyToWithdrawMoreThanCreditCardBalanceAndLimit();
        test.moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimit();
        test.moneyToWithdrawLessThanCreditCardBalance();
        test.moneyToWithdrawLessThanCreditCardBalanceAndPinCodeIsIncorrect();
        test.moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimitAndPinCodeIsIncorrect();

        test.moneyToDepositLessThanCreditDebt();
        test.moneyToDepositMoreThanCreditDebt();
        test.moneyToDepositLessThanCreditDebtAndPinCodeIsIncorrect();
        test.moneyToDepositMoreThanCreditDebtAndPinCodeIsIncorrect();

    }

    public void moneyToWithdrawMoreThanCreditCardBalanceAndLimit(){

        CreditCard creditCard = new CreditCard(1234,"123 123 123");
        creditCard.setCardBalance(100);
        creditCard.setCardCreditLimit(200);

        if(!creditCard.creditCardWithdraw(500, 1234) && creditCard.getCardBalance() == 100 && creditCard.getCardCreditDebt()==0){
            System.out.println("Money to withdraw is more, than Balance and Credit Limit! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw is more, than Balance and Credit Limit! TEST FAILED !!!");
        }
    }

    public void moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimit() {

        CreditCard creditCard = new CreditCard(1234,"123 123 123");
        creditCard.setCardBalance(20);
        creditCard.setCardCreditLimit(5);

        if(creditCard.creditCardWithdraw(25, 1234) && creditCard.getCardBalance() == 0 && creditCard.getCardCreditDebt() == 5){
            System.out.println("Money to withdraw is more, than Balance, but less, than Credit Limit! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw is more, than Balance, but less, than Credit Limit! TEST FAILED !!!");
        }
    }

    public void moneyToWithdrawLessThanCreditCardBalance() {

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardBalance(20);

        if (creditCard.creditCardWithdraw(15,1234) && creditCard.getCardBalance()== 5 && creditCard.getCardCreditDebt() == 0) {
            System.out.println("Money to withdraw less, than Credit Card balance! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw less, than Credit Card balance! TEST FAILED!!!");
        }

    }

    public void moneyToWithdrawLessThanCreditCardBalanceAndPinCodeIsIncorrect() {

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardBalance(100);

        if (!creditCard.creditCardWithdraw(70, 123123) && creditCard.getCardBalance() == 100 && creditCard.getCardCreditDebt() == 0) {
            System.out.println("Money to withdraw less, than Credit Card balance and PinCode is incorrect! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw less, than Credit Card balance and PinCode is incorrect! TEST FAILED!!!");
        }


    }

    public void moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimitAndPinCodeIsIncorrect() {

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardBalance(50);

        if(!creditCard.creditCardWithdraw(55,4321) && creditCard.getCardBalance() == 50 && creditCard.getCardCreditDebt() == 0) {
            System.out.println("Money to withdraw more, than Credit Card balance, but less, than Credit Card limit and PinCode is incorrect! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw more, than Credit Card balance, but less, than Credit Card limit and PinCode is incorrect! TEST FAILED!!!");

        }
    }

    public void moneyToDepositLessThanCreditDebt(){

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardCreditDebt(30);
        creditCard.setCardBalance(0);

        if (creditCard.creditCardDeposit(25,1234) && creditCard.getCardBalance() == 0 && creditCard.getCardCreditDebt() == 5) {
            System.out.println("Money to deposit less, than Credit Debt! TEST PASSED!!!");
        } else {
            System.out.println("Money to deposit less, than Credit Debt! TEST FAILED!!!");
        }
    }

    public void moneyToDepositMoreThanCreditDebt(){

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardCreditDebt(30);
        creditCard.setCardBalance(0);

        if (creditCard.creditCardDeposit(35,1234) && creditCard.getCardBalance() == 5 && creditCard.getCardCreditDebt() == 0) {
            System.out.println("Money to deposit more, than Credit Debt! TEST PASSED!!!");
        } else {
            System.out.println("Money to deposit more, than Credit Debt! TEST FAILED!!!");
        }
    }

    public void moneyToDepositLessThanCreditDebtAndPinCodeIsIncorrect(){

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardCreditDebt(30);
        creditCard.setCardBalance(0);

        if (!creditCard.creditCardDeposit(25,4321) && creditCard.getCardBalance() == 0 && creditCard.getCardCreditDebt() == 30) {
            System.out.println("Money to deposit less, than Credit Debt and PinCode is incorrect! TEST PASSED!!!");
        } else {
            System.out.println("Money to deposit less, than Credit Debt and PinCode is incorrect! TEST FAILED!!!");
        }
    }

    public void moneyToDepositMoreThanCreditDebtAndPinCodeIsIncorrect(){

        CreditCard creditCard = new CreditCard(1234, "123 123 123");
        creditCard.setCardCreditDebt(30);
        creditCard.setCardBalance(0);

        if (!creditCard.creditCardDeposit(35,4321) && creditCard.getCardBalance() == 0 && creditCard.getCardCreditDebt() == 30) {
            System.out.println("Money to deposit more, than Credit Debt and PinCode is incorrect! TEST PASSED!!!");
        } else {
            System.out.println("Money to deposit more, than Credit Debt and PinCode is incorrect! TEST FAILED!!!");
        }
    }
}
