package student_elina_kucenko.lesson8;

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
    }

    public void rule1TestPokemon() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test Pokemon - ok");
        } else {
            System.out.println("Test Pokemon - false");
        }
    }

    public void rule1TestNotPokemon() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        if (!fraudDetector.isFraud(transaction)) {
            System.out.println("Test Not Pokemon - ok");
        } else {
            System.out.println("Test Not Pokemon - false");
        }
    }

    public void rule2TestMoreThanMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test More Than Million - ok");
        } else {
            System.out.println("Test More Than Million - false");
        }
    }

    public void rule2TestEqualsMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        if (!fraudDetector.isFraud(transaction)) {
            System.out.println("Test Equals Million - ok");
        } else {
            System.out.println("Test Equals Million - false");
        }
    }

    public void rule2TestLessThanMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        if (!fraudDetector.isFraud(transaction)) {
            System.out.println("Test Less Than Million - ok");
        } else {
            System.out.println("Test Less Than Million - false");
        }
    }

    public void rule3TestSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Test Sydney - ok");
        } else {
            System.out.println("Test Sydney - false");
        }
    }

    public void rule3TestNotSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        if (!fraudDetector.isFraud(transaction)) {
            System.out.println("Test Not Sydney -ok");
        } else {
            System.out.println("Test Not Sydney - false");
        }
    }
}


