package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_5_Test {

    public static void main(String[] args) {
        FraudRule_5_Test test = new FraudRule_5_Test();
        test.tradersCountryAndAmountAreFraud();
        test.tradersCountryAndAmountAreNotFraud();
    }

    public void tradersCountryAndAmountAreFraud() {
        Trader trader = new Trader("Habibi", "Munich", "Germany");
        Transaction transaction = new Transaction(trader, 1500);
        FraudRule fraudRule = new FraudRule_5(" Fifth Fraud Rule");

        boolean ifTradersCountryAndAmountAreFraud = fraudRule.isFraud(transaction);
        if (ifTradersCountryAndAmountAreFraud) {
            System.out.println(fraudRule.getRuleName() + " - Traders country and amount are fraud! - Test passed! ");
        } else {
            System.out.println(" Traders country and amount safe! Test failed! ");
        }
    }

    public void tradersCountryAndAmountAreNotFraud() {
        Trader trader = new Trader("Habibi", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule fraudRule = new FraudRule_5(" Fifth Fraud Rule");

        boolean ifTradersCountryAndAmountAreFraud = fraudRule.isFraud(transaction);
        if (!ifTradersCountryAndAmountAreFraud) {
            System.out.println(" Traders country and amount are safe! - Test passed! ");
        } else {
            System.out.println(" Traders country and amount are fraud! - Test failed! ");
        }
    }
}
