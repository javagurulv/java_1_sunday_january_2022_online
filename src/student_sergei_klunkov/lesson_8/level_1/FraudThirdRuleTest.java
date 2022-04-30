package student_sergei_klunkov.lesson_8.level_1;

class FraudThirdRuleTest {

    public static void main(String[] args) {
        FraudThirdRuleTest test = new FraudThirdRuleTest();
        test.traderFromSydneyIsFraud();
        test.traderNotFromSydney();

    }

    public void traderFromSydneyIsFraud(){
        Trader trader = new Trader("Pipi","Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudThirdRule("Third Fraud Rule");

        boolean isTraderFromSydney = fraudRule.isFraud(transaction);
        if (isTraderFromSydney) {
            System.out.println(fraudRule.getRuleName()+ " - FRAUD CITY - SYDNEY! Test passed! ");
        } else {
            System.out.println(" Traders city is safe! TEST FAILED!");
        }

    }

    public void traderNotFromSydney(){
        Trader trader = new Trader("Pipi","Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudThirdRule("Third Fraud Rule");

        boolean isTraderFromSydney = fraudRule.isFraud(transaction);
        if (!isTraderFromSydney) {
            System.out.println("Traders city is safe! Test passed! ");
        } else {
            System.out.println(" Trader is from Sydney! FRAUD! TEST FAILED!");
        }

    }




}
