package student_yevgeniy_tolks.lesson_8.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraud = new FraudDetectorTest();
        fraud.isFraudTest();
        fraud.isNotFraudTest();
    }

    public void isFraudTest() {

        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultIsFraudTrader = fraud.isFraud(transaction, trader);
        if (resultIsFraudTrader) {
            System.out.println("Trader is fraud - TEST OK");
        } else {
            System.out.println("Trader is safe - TEST FAILED");
        }
    }

    public void isNotFraudTest() {

        Trader trader = new Trader("Pokemono", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraud = new FraudDetector();
        boolean resultIsFraudTrader = fraud.isFraud(transaction, trader);
        if (!resultIsFraudTrader) {
            System.out.println("Trader is safe - TEST OK");
        } else {
            System.out.println("Trader is fraud - TEST FAILED");
        }
    }
}
