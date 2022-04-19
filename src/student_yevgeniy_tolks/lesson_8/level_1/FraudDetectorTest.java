package student_yevgeniy_tolks.lesson_8.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraud = new FraudDetectorTest();
        fraud.isFraudTest();
        fraud.isNotFraudTest();
        fraud.isOtherFraudAttemptTest();
        fraud.isNotOtherFraudAttemptTest();
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
    public void isOtherFraudAttemptTest(){

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 1000001);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfOtherFraudAttempt = fraud.isFraudAttempt(transaction);
        if (resultOfOtherFraudAttempt){
            System.out.println("Transaction amount too high, fraud suspected - TEST OK ");
        }
        else {
            System.out.println("Transaction amount has no fraud suspect - TEST FAILED");
        }
    }
    public void isNotOtherFraudAttemptTest(){

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 999999);
        FraudDetector fraud = new FraudDetector();
        boolean resultOfOtherFraudAttempt = fraud.isFraudAttempt(transaction);
        if (resultOfOtherFraudAttempt){
            System.out.println("Transaction amount has no fraud suspect - TEST OK");

        }
        else {
            System.out.println("Transaction amount too high, fraud suspected - TEST FAILED ");

        }
    }
}

