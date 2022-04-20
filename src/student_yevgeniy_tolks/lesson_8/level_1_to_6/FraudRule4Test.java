package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraud = new FraudRule4Test();
        fraud.isFraudTraderCountryTest();
        fraud.isNotFraudTraderCountryTest();
    }

    public void isFraudTraderCountryTest() {
        Transaction transaction = new Transaction(new Trader("Jamaica"), 1000);
        FraudRule fraud = new FraudRule4("Fraud trader country");
        boolean resultFraudTraderCountry = fraud.isFraud(transaction);
        if (resultFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " - TEST OK ");
        } else {
            System.out.println("Not a fraud from trader country - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryTest() {
        Transaction transaction = new Transaction(new Trader("Latvia"), 1000);
        FraudRule fraud = new FraudRule4("Not a fraud trader country");

        boolean resultFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " - TEST OK ");
        } else {
            System.out.println("Fraud trader country - TEST FAILED");
        }
    }

}
