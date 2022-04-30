package student_sergei_klunkov.lesson_8.level_1;

class FraudFirstRuleTest {

    public static void main(String[] args) {
        FraudFirstRuleTest test = new FraudFirstRuleTest();
        test.isFraudFirstFraudRuleTest();
        test.isNotFraudFirstFraudRuleTest();

    }

    public void isFraudFirstFraudRuleTest() {
        Trader trader = new Trader("Pokemon", "Tallinn", "Estonia");
        Transaction transaction  = new Transaction(trader, 100);
        FraudRule fraudRule = new FraudFirstRule(" First Fraud Rule ");

        boolean isNameOfTraderFraud = fraudRule.isFraud(transaction);
        if (isNameOfTraderFraud) {
            System.out.println(fraudRule.getRuleName() + "  - TEST PASSED! ");
        } else {
            System.out.println(" Trader is not a fraud - TEST FAILED! ");
        }

    }

    public void isNotFraudFirstFraudRuleTest() {
        Trader trader = new Trader("Pokemon", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule fraud = new FraudFirstRule("Traders name is not a fraud");
        boolean isNameOfTraderNotFraud = fraud.isFraud(transaction);
        if(!isNameOfTraderNotFraud) {
            System.out.println(fraud.getRuleName() + " - TEST PASSED! ");
        } else {
            System.out.println(" Traders name - TEST FAILED! ");
        }

    }


}
