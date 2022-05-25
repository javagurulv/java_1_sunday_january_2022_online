package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_3_Test {

    public static void main(String[] args) {
        FraudRule_3_Test test = new FraudRule_3_Test();
        test.traderFromSydneyIsFraud();
        test.traderNotFromSydney();
    }

    public void traderFromSydneyIsFraud() {
        Trader trader = new Trader("Pipi","Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudRule_3(" Third Fraud Rule ");

        boolean isTraderFromSydney = fraudRule.isFraud(transaction);
        if (isTraderFromSydney) {
            System.out.println(fraudRule.getRuleName()+ " - Traders city is fraud! - TEST PASSED! ");
        } else {
            System.out.println(" Traders city is safe! - TEST FAILED! ");
        }
    }

    public void traderNotFromSydney() {
        Trader trader = new Trader("Pipi","Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudRule_3(" Third Fraud Rule ");

        boolean isTraderFromSydney = fraudRule.isFraud(transaction);
        if (!isTraderFromSydney) {
            System.out.println(" Traders city is safe! - TEST PASSED! ");
        } else {
            System.out.println(" Traders city is fraud! - TEST FAILED!");
        }
    }
}
