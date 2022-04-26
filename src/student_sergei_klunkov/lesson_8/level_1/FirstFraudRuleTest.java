package student_sergei_klunkov.lesson_8.level_1;

class FirstFraudRuleTest {

    public static void main(String[] args) {
        FirstFraudRuleTest test = new FirstFraudRuleTest();
        test.isFraudFirstFraudRuleTest();
        test.isNotFraudFirstFraudRuleTest();

    }

    public void isFraudFirstFraudRuleTest() {
        Trader trader = new Trader("Pokemon", "Tallinn");
        Transaction transaction  = new Transaction(trader, 100);
        FraudRule fraudRule = new FirstFraudRule(" First Fraud Rule ");

        boolean isNameOfTraderFraud = fraudRule.isFraud(transaction);
        if (isNameOfTraderFraud) {
            System.out.println(fraudRule.getNameOfTheRule() + "  - TEST PASSED! ");
        } else {
            System.out.println(" Trader is not a fraud - TEST FAILED! ");
        }

    }

    public void isNotFraudFirstFraudRuleTest() {
        Trader trader = new Trader("Pokemon", "Tallinn");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule fraud = new FirstFraudRule ("Traders name is not a fraud");
        boolean isNameOfTraderNotFraud = fraud.isFraud(transaction);
        if(!isNameOfTraderNotFraud) {
            System.out.println(fraud.getNameOfTheRule() + " - TEST PASSED! ");
        } else {
            System.out.println(" Traders name - TEST FAILED! ");
        }

    }


}
