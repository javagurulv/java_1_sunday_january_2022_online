package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_1_Test {

    public static void main(String[] args) {
        FraudRule_1_Test test = new FraudRule_1_Test();
        test.isFraudFirstFraudRuleTest();
        test.isNotFraudFirstFraudRuleTest();
    }

    public void isFraudFirstFraudRuleTest() {
        Trader trader = new Trader("Pokemon", "Tallinn", "Estonia");
        Transaction transaction  = new Transaction(trader, 100);
        FraudRule fraudRule = new FraudRule_1(" First Fraud Rule ");

        boolean isNameOfTraderFraud = fraudRule.isFraud(transaction);
        if (isNameOfTraderFraud) {
            System.out.println(fraudRule.getRuleName() + " Traders name is fraud! - TEST PASSED! ");
        } else {
            System.out.println(" Trader is not a fraud - TEST FAILED! ");
        }
    }

    public void isNotFraudFirstFraudRuleTest() {
        Trader trader = new Trader("PokePoke", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule fraud = new FraudRule_1(" First Fraud Rule ");

        boolean isNameOfTraderNotFraud = fraud.isFraud(transaction);
        if(!isNameOfTraderNotFraud) {
            System.out.println(fraud.getRuleName() + " Traders name is safe! - TEST PASSED! ");
        } else {
            System.out.println(" Traders name is fraud! - TEST FAILED! ");
        }
    }
}
