package student_stanislav_astafjev.lesson_8.task_1;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1 = new FraudRule1Test();
        fraudRule1.isFraudRule1Test();
        fraudRule1.isNotFraudRule1Test();
    }
    public void isFraudRule1Test(){
        Trader trader = new Trader("Michael","Tallinn","Estonia");
        Transaction transaction = new Transaction(trader,  1000);
        FraudRule fraudRule = new FraudRule1("Trader name ");
        boolean resultIsFraudTraderName = fraudRule.isFraud(transaction);
        if (resultIsFraudTraderName) {
            System.out.println(fraudRule.getRuleName() + " TEST PASS");
        } else {
            System.out.println(" TEST FAIL");
        }
    }

    public void isNotFraudRule1Test() {
        Trader trader = new Trader("Michael","Tallinn", "Poland");
        Transaction transaction = new Transaction(trader,1000);
        FraudRule fraud = new FraudRule1("Wrong trader name ");
        boolean resultIsNotFraudTraderName = fraud.isFraud(transaction);
        if(!resultIsNotFraudTraderName) {
            System.out.println(fraud.getRuleName() + " TEST PASS ");
        } else {
            System.out.println("TEST FAIL");
        }

    }

}
