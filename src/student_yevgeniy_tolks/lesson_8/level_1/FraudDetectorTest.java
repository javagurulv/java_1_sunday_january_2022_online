package student_yevgeniy_tolks.lesson_8.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraud = new FraudDetectorTest();
        fraud.isFraudTraderTest();
        fraud.isNotFraudTraderTest();
        fraud.isOtherFraudAttemptTest();
        fraud.isNotOtherFraudAttemptTest();
        fraud.isFraudTraderCityTest();
        fraud.isNotFraudTraderCityTest();
        fraud.isFraudTraderCountryTest();
        fraud.isNotFraudTraderCountryTest();
        fraud.isFraudTraderCountryWithIncreasedTransactionAmountTest();
        fraud.isNotFraudTraderCountryWithIncreasedTransactionAmountTest();
    }

    public void isFraudTraderTest() {

        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultIsFraudTrader = fraud.isFraudTrader(transaction);
        if (resultIsFraudTrader) {
            System.out.println("Trader is fraud - TEST OK");
        } else {
            System.out.println("Trader is safe - TEST FAILED");
        }
    }

    public void isNotFraudTraderTest() {

        Trader trader = new Trader("Pokemono", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultIsFraudTrader = fraud.isFraudTrader(transaction);
        if (!resultIsFraudTrader) {
            System.out.println("Trader is safe - TEST OK");
        } else {
            System.out.println("Trader is fraud - TEST FAILED");
        }
    }

    public void isOtherFraudAttemptTest() {

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 1000001);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfOtherFraudAttempt = fraud.isFraudTransactionAmount(transaction);
        if (resultOfOtherFraudAttempt) {
            System.out.println("Transaction amount too high, fraud suspected - TEST OK ");
        } else {
            System.out.println("Transaction amount has no fraud suspect - TEST FAILED");
        }
    }

    public void isNotOtherFraudAttemptTest() {

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 999999);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfOtherFraudAttempt = fraud.isFraudTransactionAmount(transaction);
        if (resultOfOtherFraudAttempt) {
            System.out.println("Transaction amount has no fraud suspect - TEST OK");

        } else {
            System.out.println("Transaction amount too high, fraud suspected - TEST FAILED ");

        }
    }

    public void isFraudTraderCityTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Sydney"), 999999);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfFraudTradeCity = fraud.isFraudTraderCity(transaction);
        if (resultOfFraudTradeCity) {
            System.out.println("Fraud trader city - TEST OK");
        } else {
            System.out.println("Not a fraud trader city - TEST FAILED");
        }
    }

    public void isNotFraudTraderCityTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 999999);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfFraudTradeCity = fraud.isFraudTraderCity(transaction);
        if (!resultOfFraudTradeCity) {
            System.out.println("Not a fraud trader city - TEST OK");
        } else {
            System.out.println("Fraud trader city - TEST FAILED");
        }
    }

    public void isFraudTraderCountryTest() {
        Transaction transaction = new Transaction(new Trader("Jamaica"), 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultFraudTraderCountry = fraud.isFraudTraderCountry(transaction);
        if (resultFraudTraderCountry) {
            System.out.println("Fraud trader country - TEST OK ");
        } else {
            System.out.println("Not a fraud from trader country - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryTest() {
        Transaction transaction = new Transaction(new Trader("Latvia"), 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultFraudTraderCountry = fraud.isFraudTraderCountry(transaction);
        if (!resultFraudTraderCountry) {
            System.out.println("Not a fraud trader country - TEST OK ");
        } else {
            System.out.println("Fraud trader country - TEST FAILED");
        }
    }

    public void isFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Germany"), 1001);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfFraudTraderCountry = fraud.isFraudTraderCountryWithIncreasedTransactionAmount(transaction);
        if (resultOfFraudTraderCountry) {
            System.out.println("Fraud trader country with increased transaction amount - TEST OK");
        } else {
            System.out.println("Not a fraud trader country, with increase of transaction amount - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Latvia"), 1001);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfFraudTraderCountry = fraud.isFraudTraderCountryWithIncreasedTransactionAmount(transaction);
        if (!resultOfFraudTraderCountry) {
            System.out.println("Not a fraud trader country, with increase of transaction amount  - TEST OK");
        } else {
            System.out.println("Fraud trader country with increased transaction amount - TEST FAILED");
        }
    }

}


