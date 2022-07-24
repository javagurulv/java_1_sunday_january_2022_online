package student_stanislav_astafjev.lesson_8.task_1;

class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraud = new FraudRule3Test();
        fraud.isFraudTraderCityTest();
        fraud.isNotFraudTraderCityTest();
    }
    public void isFraudTraderCityTest(){
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Estonia"), 100000);
        FraudRule fraud = new FraudRule3("Trader city");
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (resultOfFraudTradeCity) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }

    }
    public void isNotFraudTraderCityTest(){
        Transaction transaction = new Transaction(new Trader("Michael", "Helsinki","Estonia"), 999999);
        FraudRule fraud = new FraudRule3("Trader wrong city");
        boolean resultOfFraudTradeCity = fraud.isFraud(transaction);
        if (!resultOfFraudTradeCity) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }

    }
}
