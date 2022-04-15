package student_sergei_klunkov.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.moneyToWithdrawMoreThanCreditCardBalanceAndLimit();
        test.moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimit();



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

    public void moneyToWithdrawMoreThanCreditCardBalanceAndLessThanLimit(){
        CreditCard creditCard = new CreditCard(1234,"123 123 123");
        creditCard.setCardBalance(20);
        creditCard.setCardCreditLimit(5);

        if(creditCard.creditCardWithdraw(25, 1234) && creditCard.getCardBalance() == 0 && creditCard.getCardCreditDebt() == 5){
            System.out.println("Money to withdraw is more, than Balance, but less, than Credit Limit! TEST PASSED!!!");
        } else {
            System.out.println("Money to withdraw is more, than Balance, but less, than Credit Limit! TEST FAILED !!!");
        }
    }
}
