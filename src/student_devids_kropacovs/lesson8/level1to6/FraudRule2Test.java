package student_devids_kropacovs.lesson8.level1to6;

class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.isFraudRule2Test();
        fraudRule2Test.isNotFraudRule2Test();
    }

    public void isFraudRule2Test(){
        FraudRule2 fraudRule2 = new FraudRule2("Rule2");
        Trader trader = new Trader("John", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 1000001);
        if(fraudRule2.isFraud(transaction)){
            System.out.println("Rule 2 is fraud test PASS");
        }else{
            System.out.println("Rule 2 is fraud test FAIL");
        }
    }

    public void isNotFraudRule2Test(){
        FraudRule2 fraudRule2 = new FraudRule2("Rule2");
        Trader trader = new Trader("John", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 999999);
        if(!fraudRule2.isFraud(transaction)){
            System.out.println("Rule 2 is not fraud test PASS");
        }else{
            System.out.println("Rule 2 is not fraud test FAIL");
        }
    }

}
