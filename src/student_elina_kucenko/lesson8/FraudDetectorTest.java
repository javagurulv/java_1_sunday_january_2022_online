package student_elina_kucenko.lesson8;

import java.util.Arrays;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.rule1TestPokemon();
        fraudDetectorTest.rule1TestNotPokemon();
        fraudDetectorTest.rule2TestMoreThanMillion();
        fraudDetectorTest.rule2TestEqualsMillion();
        fraudDetectorTest.rule2TestLessThanMillion();
        fraudDetectorTest.rule3TestSydney();
        fraudDetectorTest.rule3TestNotSydney();
        fraudDetectorTest.rule4TestJamaica();
        fraudDetectorTest.rule4TestNotJamaica();
        fraudDetectorTest.rule5TestTraderFromGermanyAndMoreThanThousand();
        fraudDetectorTest.rule5TestTraderFromGermanyAndEqualsThousand();
        fraudDetectorTest.rule5TestTraderFromGermanyAndLessThanThousand();
        fraudDetectorTest.rule5TestTraderNotFromGermanyAndMoreThanThousand();
        fraudDetectorTest.rule5TestTraderNotFromGermanyAndEqualsThousand();
        fraudDetectorTest.rule5TestTraderNotFromGermanyAndLessThanThousand();
    }

    public void rule1TestPokemon() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (fraudDetectionResult.isFraud()) {
            System.out.println("Test Pokemon - ok");
        } else {
            System.out.println("Test Pokemon - false");
        }
    }

    public void rule1TestNotPokemon() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Not Pokemon - ok");
        } else {
            System.out.println("Test Not Pokemon - false");
        }
    }

    public void rule2TestMoreThanMillion() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (fraudDetectionResult.isFraud()) {
            System.out.println("Test More Than Million - ok");
        } else {
            System.out.println("Test More Than Million - false");
        }
    }

    public void rule2TestEqualsMillion() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Equals Million - ok");
        } else {
            System.out.println("Test Equals Million - false");
        }
    }

    public void rule2TestLessThanMillion() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Less Than Million - ok");
        } else {
            System.out.println("Test Less Than Million - false");
        }
    }

    public void rule3TestSydney() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (fraudDetectionResult.isFraud()) {
            System.out.println("Test Sydney - ok");
        } else {
            System.out.println("Test Sydney - false");
        }
    }

    public void rule3TestNotSydney() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Not Sydney -ok");
        } else {
            System.out.println("Test Not Sydney - false");
        }
    }

    public void rule4TestJamaica() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (fraudDetectionResult.isFraud()) {
            System.out.println("Test Jamaica - ok");
        } else {
            System.out.println("Test Jamaica - false");
        }
    }

    public void rule4TestNotJamaica() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Not Jamaica -ok");
        } else {
            System.out.println("Test Not Jamaica - false");
        }
    }

    public void rule5TestTraderFromGermanyAndMoreThanThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (fraudDetectionResult.isFraud()) {
            System.out.println("Test More Than Million - ok");
        } else {
            System.out.println("Test More Than Million - false");
        }
    }

    public void rule5TestTraderFromGermanyAndEqualsThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Equals Million - ok");
        } else {
            System.out.println("Test Equals Million - false");
        }
    }

    public void rule5TestTraderFromGermanyAndLessThanThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Less Than Million - ok");
        } else {
            System.out.println("Test Less Than Million - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndMoreThanThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test More Than Million - ok");
        } else {
            System.out.println("Test More Than Million - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndEqualsThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Equals Million - ok");
        } else {
            System.out.println("Test Equals Million - false");
        }
    }

    public void rule5TestTraderNotFromGermanyAndLessThanThousand() {
        FraudDetector fraudDetector = getFraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        if (!fraudDetectionResult.isFraud()) {
            System.out.println("Test Less Than Million - ok");
        } else {
            System.out.println("Test Less Than Million - false");
        }
    }

    private FraudDetector getFraudDetector() {
        List<FraudRule> rules = Arrays.asList(
                new FraudRule1("Rule1"),
                new FraudRule2("Rule2"),
                new FraudRule3("Rule3"),
                new FraudRule4("Rule4"),
                new FraudRule5("Rule5"));
        return new FraudDetector(rules);
    }
}


