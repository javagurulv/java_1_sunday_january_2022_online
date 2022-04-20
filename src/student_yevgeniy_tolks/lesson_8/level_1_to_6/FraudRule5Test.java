package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test fraud = new FraudRule5Test();
        fraud.isFraudTraderCountryWithIncreasedTransactionAmountTest();
        fraud.isNotFraudTraderCountryWithIncreasedTransactionAmountTest();
    }

    public void isFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Germany"), 1001);
        FraudRule fraud = new FraudRule5("Fraud trader country with increased transaction amount");
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (resultOfFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " - TEST OK");
        } else {
            System.out.println("Not a fraud trader country, with increase of transaction amount - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Latvia"), 1001);
        FraudRule fraud = new FraudRule5("Not a fraud trader country, with increased of transaction amount");
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultOfFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " - TEST OK");
        } else {
            System.out.println("Fraud trader country with increased transaction amount - TEST FAILED");
        }
    }
}
