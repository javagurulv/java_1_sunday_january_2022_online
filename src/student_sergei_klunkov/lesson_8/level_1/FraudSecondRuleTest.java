package student_sergei_klunkov.lesson_8.level_1;

class FraudSecondRuleTest {

    public static void main(String[] args) {
        FraudSecondRuleTest test = new FraudSecondRuleTest();
        test.secondFraudRuleTestWhenAmountHigher();
        test.secondFraudRuleTestWhenAmountLower();

    }

    public void secondFraudRuleTestWhenAmountHigher() {
        Trader trader = new Trader("Biba", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader,100000);
        FraudRule fraudRule = new FraudSecondRule("Second Fraud Rule");

        boolean isAmountBiggerThenInFraudRule = fraudRule.isFraud(transaction);
        if (isAmountBiggerThenInFraudRule) {
            System.out.println(" Amount is higher, then in the rule of fraud " + " - TEST PASSED! ");
        } else {
            System.out.println(" Amount is lower, then in the rule of fraud " + " - TEST FAILED! ");
        }
    }

    public void secondFraudRuleTestWhenAmountLower() {
        Trader trader = new Trader("Biba", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudSecondRule("Second Fraud Rule");

        boolean isAmountLowerThenInSecondFraudRule = fraudRule.isFraud(transaction);
        if (!isAmountLowerThenInSecondFraudRule) {
            System.out.println(" Amount is lower, then in the rule of fraud " +  " - TEST PASSED! ");
        } else {
            System.out.println(" Amount is higher, then is the rule of fraud " + " - TEST FAILED! ");
        }

    }



}
