package student_stanislav_astafjev.lesson_8.task_1;

public class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test fraud = new FraudRule2Test();
        fraud.isFraudTransactionAmountTest();
        fraud.isNotFraudTransactionAmountTest();
    }
    public void isFraudTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Estonia"), 1000001);
        FraudRule fraud = new FraudRule2("Transaction high");
        boolean resultOfHighTransactionAmount = fraud.isFraud(transaction);
        if (resultOfHighTransactionAmount) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }


    public void isNotFraudTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Estonia"), 10000);
        FraudRule fraud = new FraudRule2("Transaction high");
        boolean resultOfTransactionAmount = fraud.isFraud(transaction);
        if (!resultOfTransactionAmount) {
            System.out.println(" TEST PASS ");
        } else {
            System.out.println(fraud.getRuleName() + "TEST FAIL ");
        }

    }

}
