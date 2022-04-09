package student_yevgeniy_tolks.lesson_7.level_6.task10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.pinIsCorrectTest();
        creditCardTest.depositMoneyTest();
        creditCardTest.withdrawMoneyTest();
    }

    public void pinIsCorrectTest() {
        long cardNumber = 0L;
        int pinCode = 1111;

        CreditCard creditCard = new CreditCard(cardNumber, 1111);
        int expectedResult = creditCard.getPinCode();
        if (expectedResult == pinCode) {
            System.out.println("PIN CODE correct, ready to use account  - TEST OK");
        } else {
            System.out.println("PIN CODES are different, operation with account aborted - TEST FAILED");
        }
    }

    public void depositMoneyTest() {
        long cardNumber = 0L;
        double moneyAmountToDeposit = 10;
        int pinCode = 1111;

        CreditCard creditCard = new CreditCard(cardNumber, 1111);
        boolean expectedResult = creditCard.depositMoney(pinCode, moneyAmountToDeposit);
        if (expectedResult) {
            System.out.println("PIN CODE correct, ready to deposit requested amount of money - TEST OK");
        } else {
            System.out.println("NOT Correct pin or/and money wasn't deposited - TEST FAILED");
        }
    }
    public void withdrawMoneyTest() {
        long cardNumber = 0L;
        double moneyAmountToWithdraw = 122;
        int pinCode = 1111;
        double creditLimit = 122;

        CreditCard creditCard = new CreditCard(cardNumber, 1111);
        boolean expectedResult = creditCard.withdrawMoney(pinCode, moneyAmountToWithdraw,creditLimit);
        if (expectedResult) {
            System.out.println("PIN CODE correct, ready to withdraw requested amount of money - TEST OK");
        } else {
            System.out.println("NOT Correct pin or money to withdraw exceeds credit limit - TEST FAILED");
        }
    }
}
