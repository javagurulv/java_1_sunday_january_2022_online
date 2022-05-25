package student_devids_kropacovs.lesson8.level1to6;

public class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.isFraudRule5Test();
        fraudRule5Test.isNotFraudRule5Test();
    }

    public void isFraudRule5Test(){
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        Trader trader = new Trader("Vasja", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        if(fraudRule5.isFraud(transaction)){
            System.out.println("Rule 5 is fraud test PASS");
        }else{
            System.out.println("Rule 5 is fraud test FAIL");
        }
    }

    public void isNotFraudRule5Test(){
        FraudRule5 fraudRule5 = new FraudRule5("Rule5");
        Trader trader = new Trader("Vasja", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        if(!fraudRule5.isFraud(transaction)){
            System.out.println("Rule 5 is not fraud test PASS");
        }else{
            System.out.println("Rule 5 is not fraud test FAIL");
        }
    }
}
