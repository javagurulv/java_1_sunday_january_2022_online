package student_sergei_klunkov.lesson_8.level_1;


import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isFraudTraderNameTest();
        test.isNotFraudTraderNameTest();
    }

    public List<FraudRule> addListWithRules() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FirstFraudRule("FirstFraudRule"));
        fraudRules.add(new SecondFraudRule("SecondFraudRule"));
        return fraudRules;
    }

    public void isFraudTraderNameTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pokemon", "Tallinn");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (fraudDetectionResult.isFraud()) {
            System.out.println(fraudDetectionResult.getRuleName() + " - Traders name is FRAUD! - TEST PASSED!");
        } else {
            System.out.println("Traders name is not a FRAUD! - TEST FAILED!!!");
        }
    }

    public void isNotFraudTraderNameTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pokem", "Tallinn");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Traders name is OK! - TEST PASSED!");
        } else {
            System.out.println("Traders name is a FRAUD! - TEST FAILED!!!");
        }
    }






}
