package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraud = new FraudRule3Test();
        fraud.isFraudTraderCityTest();
        fraud.isNotFraudTraderCityTest();
    }
    public void isFraudTraderCityTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga","Sydney"), 999999);
        FraudRule fraud = new FraudRule3("Fraud trader city");
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (resultOfFraudTradeCity) {
            System.out.println(fraud.getRuleName() + " - TEST OK");
        } else {
            System.out.println("Not a fraud trader city - TEST FAILED");
        }
    }
    public void isNotFraudTraderCityTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga","Sydney"), 999999);
        FraudRule fraud = new FraudRule3("Not a fraud trader city");
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (!resultOfFraudTradeCity) {
            System.out.println(fraud.getRuleName() + " - Test OK");
        } else {
            System.out.println("Fraud trader city - TEST FAILED");
        }

    }
    }
