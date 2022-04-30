package student_sergei_klunkov.lesson_8.level_1;


import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isFraudTraderNameTest();
        test.isNotFraudTraderNameTest();
        test.tradersAmountIsFraudAmount();
        test.tradersAmountIsNotFraudAmount();
        test.tradersCityIsFraudCity();
        test.tradersCityIsNotFraudCity();
        test.tradersCountryIsFraudCountry();
        test.tradersCountryIsNotFraudCountry();
    }

    public List<FraudRule> addListWithRules() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudFirstRule("First Fraud Rule"));
        fraudRules.add(new FraudSecondRule("Second Fraud Rule"));
        fraudRules.add(new FraudThirdRule("Third Fraud Rule"));
        fraudRules.add(new FraudFourthRule("Fourth Fraud Rule"));
        return fraudRules;
    }

    public void isFraudTraderNameTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pokemon", "Tallinn", "Estonia");
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
        Trader trader = new Trader("Pokem", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Traders name is OK! - TEST PASSED!");
        } else {
            System.out.println("Traders name is a FRAUD! - TEST FAILED!!!");
        }
    }

    public void tradersAmountIsFraudAmount() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Bibi","Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 100001);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (fraudDetectionResult.isFraud()) {
            System.out.println(" Transaction amount is fraud! TEST PASSED! ");
        } else {
            System.out.println(" Transaction amount is not fraud! TEST FAILED! ");
        }
    }

    public void tradersAmountIsNotFraudAmount() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Bibi","Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println(" Transaction amount is not fraud amount! TEST PASSED! ");
        } else {
            System.out.println(" Transaction amount is fraud amount! TEST FAILED! ");
        }
    }

    public void tradersCityIsFraudCity() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pipi", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (fraudDetectionResult.isFraud()) {
            System.out.println(" Trader is from Sydney! This is fraud city! TEST PASSED! ");
        } else {
            System.out.println(" Trader is not from Sydney! TEST FAILED! ");
        }
    }

    public void tradersCityIsNotFraudCity() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pipi", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println(" Trader is not from Sydney!  TEST PASSED! ");
        } else {
            System.out.println(" Trader is from Sydney! Fraud!  TEST FAILED! ");
        }
    }

    public void tradersCountryIsFraudCountry() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Abibi", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (fraudDetectionResult.isFraud()) {
            System.out.println(" Traders country is fraud! TEST PASSED! ");
        } else {
            System.out.println(" Traders country is safe! TEST FAILED! ");
        }
    }

    public void tradersCountryIsNotFraudCountry() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Abibi", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult fraudDetectionResult = fraudRule.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println(" Traders country is safe! TEST PASSED! ");
        } else {
            System.out.println(" Traders country is fraud! TEST FAILED! ");
        }
    }






}
