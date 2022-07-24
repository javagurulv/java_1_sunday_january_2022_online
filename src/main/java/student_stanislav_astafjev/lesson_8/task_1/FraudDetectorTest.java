package student_stanislav_astafjev.lesson_8.task_1;

import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
      public static void main(String[] args) {
        FraudDetectorTest fraud = new FraudDetectorTest();
        fraud.isFraudTraderNameTest();
        fraud.isNotFraudTraderNameTest();
        fraud.isFraudTransactionAmountTest();
        fraud.isNotFraudTransactionAmountTest();
        fraud.isFraudTraderCityTest();
        fraud.isNotFraudTraderCityTest();
        fraud.isFraudTraderCountryTest();
        fraud.isNotFraudTraderCountryTest();
        fraud.isFraudTraderCountryWithIncreasedTransactionAmountTest();
        fraud.isNotFraudTraderCountryWithIncreasedTransactionAmountTest();

    }

    public List<FraudRule> addListWithRules() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Rule1"));
        fraudRules.add(new FraudRule2("Rule2"));
        fraudRules.add(new FraudRule3("Rule3"));
        fraudRules.add(new FraudRule4("Rule4"));
        fraudRules.add(new FraudRule5("Rule5"));
        return fraudRules;
    }
     public void isFraudTraderNameTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Michael", "Tallinn", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        FraudDetectionResult resultIsFraudTrader = fraudRule.isFraud(transaction);
        if (resultIsFraudTrader.isFraud()) {
            System.out.println(resultIsFraudTrader.getRuleName() + " TEST PASS ");
        } else {
            System.out.println("TEST FAIL");
        }
    }
     public void isNotFraudTraderNameTest() {
          List<FraudRule> fraudRules = addListWithRules();
          Trader trader = new Trader("Mihuil", "Tallinn", "Estonia");
          Transaction transaction = new Transaction(trader, 1000);
          FraudDetector fraudRule = new FraudDetector(fraudRules);
          FraudDetectionResult resultIsFraudTrader = fraudRule.isFraud(transaction);
          if (!resultIsFraudTrader.isFraud()) {
              System.out.println("TEST PASS");
          } else {
              System.out.println("TEST FAIL");
          }
      }
      public void isFraudTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Estonia"), 10000001);
        FraudDetector fraudRule = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfFraudTransactionAmount = fraudRule.isFraud(transaction);
        if (resultOfFraudTransactionAmount.isFraud()) {
            System.out.println(resultOfFraudTransactionAmount.getRuleName() + " TEST PASS  ");
        } else {
            System.out.println("TEST FAIL");
        }
    }
     public void isNotFraudTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Estonia"), 9999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfOtherFraudAttempt = fraud.isFraud(transaction);
        if (!resultOfOtherFraudAttempt.isFraud()) {
            System.out.println(" TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");

        }

    }
     public void isFraudTraderCityTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Estonia"), 9999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (resultOfFraudTradeCity.isFraud()) {
            System.out.println(resultOfFraudTradeCity.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
     public void isNotFraudTraderCityTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Helsinki", "Estonia"), 9999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (!resultOfFraudTradeCity.isFraud()) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
     public void isFraudTraderCountryTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Estonia"), 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);
        FraudDetectionResult resultFraudTraderCountry = fraudRule.isFraud(transaction);
        if (resultFraudTraderCountry.isFraud()) {
            System.out.println(resultFraudTraderCountry.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
    public void isNotFraudTraderCountryTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Poland"), 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);
        FraudDetectionResult resultFraudTraderCountry = fraudRule.isFraud(transaction);
        if (!resultFraudTraderCountry.isFraud()) {
            System.out.println(" TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
     public void isFraudTraderCountryWithIncreasedTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael ", "Tallinn ", "Estonia"), 1001);
        FraudDetector fraud = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (resultOfFraudTraderCountry.isFraud()) {
            System.out.println(resultOfFraudTraderCountry.getRuleName() + " TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
    public void isNotFraudTraderCountryWithIncreasedTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn", "Russia"), 10002);
        FraudDetector fraud = new FraudDetector(fraudRules);
        FraudDetectionResult resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultOfFraudTraderCountry.isFraud()) {
            System.out.println(" TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
}