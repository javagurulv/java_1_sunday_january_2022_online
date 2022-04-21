package student_yevgeniy_tolks.lesson_8.level_1_to_6;

import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraud = new FraudDetectorTest();
        fraud.isFraudTraderNameTest();
        fraud.isNotFraudTraderNameTest();
        fraud.isOtherFraudAttemptTest();
        fraud.isNotOtherFraudAttemptTest();
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
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);

        boolean resultIsFraudTrader = fraudRule.isFraud(transaction);
        if (resultIsFraudTrader) {
            System.out.println("Trader is fraud - TEST OK");
        } else {
            System.out.println("Trader is safe - TEST FAILED");
        }
    }

    public void isNotFraudTraderNameTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Trader trader = new Trader("Pokemono", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);
        boolean resultIsFraudTrader = fraudRule.isFraud(transaction);
        if (!resultIsFraudTrader) {
            System.out.println("Trader is safe - TEST OK");
        } else {
            System.out.println("Trader is fraud - TEST FAILED");
        }
    }

    public void isOtherFraudAttemptTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Latvia"), 10000001);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfOtherFraudAttempt = fraud.isFraud(transaction);
        if (resultOfOtherFraudAttempt) {
            System.out.println("Transaction amount too high, fraud suspected - TEST OK ");
        } else {
            System.out.println("Transaction amount has no fraud suspect - TEST FAILED");
        }
    }

    public void isNotOtherFraudAttemptTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Latvia"), 99999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfOtherFraudAttempt = fraud.isFraud(transaction);
        if (!resultOfOtherFraudAttempt) {
            System.out.println("Transaction amount has no fraud suspect - TEST OK");

        } else {
            System.out.println("Transaction amount too high, fraud suspected - TEST FAILED ");

        }
    }

    public void isFraudTraderCityTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Sydney", "Latvia"), 9999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (resultOfFraudTradeCity) {
            System.out.println("Fraud trader city - TEST OK");
        } else {
            System.out.println("Not a fraud trader city - TEST FAILED");
        }
    }

    public void isNotFraudTraderCityTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Latvia"), 9999);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (!resultOfFraudTradeCity) {
            System.out.println("Not a fraud trader city - TEST OK");
        } else {
            System.out.println("Fraud trader city - TEST FAILED");
        }
    }

    public void isFraudTraderCountryTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Jamaica"), 1000);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultFraudTraderCountry = fraud.isFraud(transaction);
        if (resultFraudTraderCountry) {
            System.out.println("Fraud trader country - TEST OK ");
        } else {
            System.out.println("Not a fraud from trader country - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Latvia"), 1000);
        FraudDetector fraudRule = new FraudDetector(fraudRules);
        boolean resultFraudTraderCountry = fraudRule.isFraud(transaction);
        if (!resultFraudTraderCountry) {
            System.out.println("Not a fraud trader country - TEST OK ");
        } else {
            System.out.println("Fraud trader country - TEST FAILED");
        }
    }

    public void isFraudTraderCountryWithIncreasedTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Germany"), 1001);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (resultOfFraudTraderCountry) {
            System.out.println("Fraud trader country with increased transaction amount - TEST OK");
        } else {
            System.out.println("Not a fraud trader country, with increase of transaction amount - TEST FAILED");
        }
    }

    public void isNotFraudTraderCountryWithIncreasedTransactionAmountTest() {
        List<FraudRule> fraudRules = addListWithRules();
        Transaction transaction = new Transaction(new Trader("Pokemons", "Riga", "Latvia"), 10002);
        FraudDetector fraud = new FraudDetector(fraudRules);
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultOfFraudTraderCountry) {
            System.out.println("Not a fraud trader country, with increase of transaction amount  - TEST OK");
        } else {
            System.out.println("Fraud trader country with increased transaction amount - TEST FAILED");
        }
    }
}
