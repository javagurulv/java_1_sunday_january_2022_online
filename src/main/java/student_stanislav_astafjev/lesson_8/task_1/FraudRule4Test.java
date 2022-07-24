package student_stanislav_astafjev.lesson_8.task_1;

class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraud = new FraudRule4Test();
        fraud.isFraudTraderCountryTest();
        fraud.isNotFraudTraderCountryTest();
    }
    public void isFraudTraderCountryTest(){
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Estonia"), 100000);
        FraudRule fraud = new FraudRule4("Trader country");
        boolean resultFraudTraderCountry = fraud.isFraud(transaction);
        if (resultFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }

    }
    public void isNotFraudTraderCountryTest() {
        Transaction transaction = new Transaction(new Trader("Michael", "Tallinn","Turkey"), 100000);
        FraudRule fraud = new FraudRule4("Not a trader country");

        boolean resultFraudTraderCountry = fraud.isFraud(transaction);
        if (!resultFraudTraderCountry) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println(" TEST FAIL ");
        }

    }
}
