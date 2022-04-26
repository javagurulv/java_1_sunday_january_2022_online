package student_devids_kropacovs.lesson8.level1;

public class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.isFraudRule3Test();
        fraudRule3Test.isNotFraudRule3Test();
    }

    public void isFraudRule3Test(){
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        Trader trader = new Trader("Igor", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        if(fraudRule3.isFraud(transaction)){
            System.out.println("Rule 3 is fraud test PASS");
        }else{
            System.out.println("Rule 3 is fraud test FAIL");
        }
    }

    public void isNotFraudRule3Test(){
        FraudRule3 fraudRule3 = new FraudRule3("Rule3");
        Trader trader = new Trader("Vasja", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        if(!fraudRule3.isFraud(transaction)){
            System.out.println("Rule 3 is not fraud test PASS");
        }else{
            System.out.println("Rule 3 is not fraud test FAIL");
        }
    }
}
