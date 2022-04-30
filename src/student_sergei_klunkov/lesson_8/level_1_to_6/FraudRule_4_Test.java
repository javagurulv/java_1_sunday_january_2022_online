package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_4_Test {

    public static void main(String[] args) {
        FraudRule_4_Test test = new FraudRule_4_Test();
        test.traderIsFromJamaicaFraud();
        test.traderIsNotFromJamaicaFraud();
    }

    public void traderIsFromJamaicaFraud() {
        Trader trader = new Trader("Abibi", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudRule_4(" Fourth Fraud Rule ");

        boolean tradersCountryIsFraudCountry = fraudRule.isFraud(transaction);
        if (tradersCountryIsFraudCountry) {
            System.out.println(fraudRule.getRuleName() + " - Traders country is fraud! - TEST PASSED! ");
        } else {
            System.out.println(" Traders country is safe! - TEST FAILED! ");
        }
    }

    public void traderIsNotFromJamaicaFraud() {
        Trader trader = new Trader("Abibi", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraudRule = new FraudRule_4(" Fourth Fraud Rule ");

        boolean tradersCountryIsFraudCountry = fraudRule.isFraud(transaction);
        if (!tradersCountryIsFraudCountry) {
            System.out.println(" Traders country is safe! - TEST PASSED! ");
        } else {
            System.out.println(" Traders country is fraud! - TEST FAILED! ");
        }
    }
}
