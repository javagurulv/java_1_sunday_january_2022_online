package student_yevgeniy_tolks.lesson_8.level_1_to_6;

public class FraudRule2Test {
    public static void main(String[] args) {

        FraudRule2Test fraud = new FraudRule2Test();
        fraud.isFraudTransactionAmountTest();
        fraud.isNotFraudTransactionAmountTest();
    }

    public void isFraudTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga","Sydney"), 1000001);
        FraudRule fraud = new FraudRule2("Transaction amount high");
        boolean resultOfHighTransactionAmount = fraud.isFraud(transaction);
        if (resultOfHighTransactionAmount) {
            System.out.println(fraud.getRuleName() + ", fraud suspect - TEST OK");
        } else {
            System.out.println("Transaction amount has no fraud suspect - TEST FAILED");
        }
    }

    public void isNotFraudTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga","Sydney"), 10000);
        FraudRule fraud = new FraudRule2("Transaction amount high");
        boolean resultOfTransactionAmount = fraud.isFraud(transaction);
        if (!resultOfTransactionAmount) {
            System.out.println("Transaction amount has no fraud suspect - TEST OK");
        } else {
            System.out.println(fraud.getRuleName() + ", fraud suspect - TEST FAILED");
        }
    }
}

