package student_stanislav_astafjev.lesson_8.task_1;

 class FraudRule5Test {
  public static void main(String[] args) {
        FraudRule5Test fraud = new FraudRule5Test();
        fraud.isFraudTraderCountryWithIncreasedTransactionAmountTest();
        fraud.isNotFraudTraderCountryWithIncreasedTransactionAmountTest();
    }
    public void isFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Russia"), 1001);
        FraudRule fraud = new FraudRule5("Trader country transaction amount");
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (resultOfFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
    public void isNotFraudTraderCountryWithIncreasedTransactionAmountTest() {
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Estonia"), 1001);
        FraudRule fraud = new FraudRule5("Not  trader country of transaction amount");
        boolean resultOfFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultOfFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + "TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }
    }
}
