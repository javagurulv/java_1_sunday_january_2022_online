package student_devids_kropacovs.lesson8.level1to6;

public class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.isFraudRule4Test();
        fraudRule4Test.isNotFraudRule4Test();
    }

    public void isFraudRule4Test(){
        FraudRule4 fraudRule4 = new FraudRule4("Rule4");
        Trader trader = new Trader("Vasja", "IDK", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        if(fraudRule4.isFraud(transaction)){
            System.out.println("Rule 4 is fraud test PASS");
        }else{
            System.out.println("Rule 4 is fraud test FAIL");
        }
    }

    public void isNotFraudRule4Test(){
        FraudRule4 fraudRule4 = new FraudRule4("Rule4");
        Trader trader = new Trader("Vasja", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        if(!fraudRule4.isFraud(transaction)){
            System.out.println("Rule 4 is not fraud test PASS");
        }else{
            System.out.println("Rule 4 is not fraud test FAIL");
        }
    }
}
