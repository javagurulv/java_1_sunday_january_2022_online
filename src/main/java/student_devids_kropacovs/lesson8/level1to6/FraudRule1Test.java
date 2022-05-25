package student_devids_kropacovs.lesson8.level1to6;

public class FraudRule1Test {
    public static void main(String[] args) {

        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.isFraudRule1Test();
        fraudRule1Test.isNotFraudRule1Test();
    }

    public void isFraudRule1Test(){
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        if(fraudRule1.isFraud(transaction)){
            System.out.println("Is Fraud rule 1 test PASS");
        }else{
            System.out.println("Is Fraud rule 1 test FAIL");
        }
    }

    public void isNotFraudRule1Test(){
        FraudRule1 fraudRule1 = new FraudRule1("Rule1");
        Trader trader = new Trader("Dima", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        if(!fraudRule1.isFraud(transaction)){
            System.out.println("Is Fraud rule 1 test PASS");
        }else{
            System.out.println("Is Fraud rule 1 test FAIL");
        }
    }
}
