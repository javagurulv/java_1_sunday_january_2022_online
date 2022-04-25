package student_elina_kucenko.lesson8;


public class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.rule5TestTraderFromGermanyAndMoreThanThousand();
        fraudRule5Test.rule5TestTraderFromGermanyAndEqualsThousand();
        fraudRule5Test.rule5TestTraderFromGermanyAndLessThanThousand();
        fraudRule5Test.rule5TestTraderNotFromGermanyAndMoreThanThousand();
        fraudRule5Test.rule5TestTraderNotFromGermanyAndEqualsThousand();
        fraudRule5Test.rule5TestTraderNotFromGermanyAndLessThanThousand();
    }

    public void rule5TestTraderFromGermanyAndMoreThanThousand() {

        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader From Germany And More Than Thousand - ok");
        } else {
            System.out.println("Rule5: Test Trader From Germany And More Than Thousand - false");
        }
    }

    public void rule5TestTraderFromGermanyAndEqualsThousand() {
        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader From Germany And Equals Thousand - ok");
        } else {
            System.out.println("Rule5: Test Trader From Germany And Equals Thousand - false");
        }
    }

    public void rule5TestTraderFromGermanyAndLessThanThousand() {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(false, "Rule5");
        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader From Germany And Less Than Thousand - ok");
        } else {
            System.out.println("Rule5: Test Trader From Germany And Less Than Thousand - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndMoreThanThousand() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader Not From Germany And More Than Thousand - ok");
        } else {
            System.out.println("Rule5: Test Trader Not From Germany And More Than Thousand - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndEqualsThousand() {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(false, "Rule5");
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader Not From Germany And Equals Thousand  - ok");
        } else {
            System.out.println("Rule5: Test Trader Not From Germany And Equals Thousand - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndLessThanThousand() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule5 rule = new FraudRule5("FraudRule5");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule5: Test Trader Not From Germany And Less Than Thousand - ok");
        } else {
            System.out.println("Rule5: Test Trader Not From Germany And Less Than Thousand - false");
        }
    }
}
