package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1 = new FraudRule1Test();
        fraudRule1.isFraudRule1Test();
        fraudRule1.isNotFraudRule1Test();
    }

    public void isFraudRule1Test() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraud = new FraudRule1("Fraud trader name");
        boolean resultIsFraudTraderName = fraud.isFraud(transaction);
        if (resultIsFraudTraderName) {
            System.out.println(fraud.getRuleName() + " - TEST OK");
        } else {
            System.out.println("Trader is safe - TEST FAILED");
        }
    }

    public void isNotFraudRule1Test() {
        Trader trader = new Trader("Pokemono", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule fraud = new FraudRule1("Not a fraud trader name");
        boolean resultIsNotFraudTraderName = fraud.isFraud(transaction);
        if (!resultIsNotFraudTraderName) {
            System.out.println(fraud.getRuleName() + " - TEST OK");
        } else {
            System.out.println("Fraud trader name   - TEST FAILED");
        }
    }


}
