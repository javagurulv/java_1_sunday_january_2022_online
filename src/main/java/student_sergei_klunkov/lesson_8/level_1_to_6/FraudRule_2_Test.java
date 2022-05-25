package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_2_Test {

    public static void main(String[] args) {
        FraudRule_2_Test test = new FraudRule_2_Test();
        test.secondFraudRuleTestWhenAmountHigher();
        test.secondFraudRuleTestWhenAmountLower();
    }

    public void secondFraudRuleTestWhenAmountHigher() {
        Trader trader = new Trader("Biba", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader,100000);
        FraudRule fraudRule = new FraudRule_2(" Second Fraud Rule ");

        boolean isAmountBiggerThenInFraudRule = fraudRule.isFraud(transaction);
        if (isAmountBiggerThenInFraudRule) {
            System.out.println(fraudRule.getRuleName() + " - Traders amount is fraud! - TEST PASSED! ");
        } else {
            System.out.println(" Traders amount is safe! - TEST FAILED! ");
        }
    }

    public void secondFraudRuleTestWhenAmountLower() {
        Trader trader = new Trader("Biba", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudRule_2(" Second Fraud Rule ");

        boolean isAmountLowerThenInSecondFraudRule = fraudRule.isFraud(transaction);
        if (!isAmountLowerThenInSecondFraudRule) {
            System.out.println(" Traders amount is safe! - TEST PASSED! ");
        } else {
            System.out.println(" Traders amount is fraud! - TEST FAILED! ");
        }
    }
}
