package student_devids_kropacovs.lesson8.level1;

public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isFraudRule1Test();
        fraudDetectorTest.isNotFraudRule1Test();
        fraudDetectorTest.isFraudRule2Test();
        fraudDetectorTest.isNotFraudRule2Test();
        fraudDetectorTest.isFraudRule3Test();
        fraudDetectorTest.isNotFraudRule3Test();
        fraudDetectorTest.isNotFraudRule4Test();
        fraudDetectorTest.isFraudRule4Test();
        fraudDetectorTest.isFraudRule5Test();
        fraudDetectorTest.isNotFraudRule5Test();
    }

    public void isFraudRule1Test(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudRule1(transaction)){
            System.out.println("Rule 1 is fraud test PASS");
        }else{
            System.out.println("Rule 1 is fraud test FAIL");
        }
    }

    public void isNotFraudRule1Test(){
        Trader trader = new Trader("Jonny", "New York", "US");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudRule1(transaction)){
            System.out.println("Rule 1 is not Fraud test PASS");
        }else{
            System.out.println("Rule 1 is not Fraud test FAIL");
        }
    }

    public void isFraudRule2Test(){
        Trader trader = new Trader("John", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudRule2(transaction.getAmount())){
            System.out.println("Rule 2 is fraud test PASS");
        }else{
            System.out.println("Rule 2 is fraud test FAIL");
        }
    }

    public void isNotFraudRule2Test(){
        Trader trader = new Trader("John", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 999999);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudRule2(transaction.getAmount())){
            System.out.println("Rule 2 is not fraud test PASS");
        }else{
            System.out.println("Rule 2 is not fraud test FAIL");
        }
    }

    public void isFraudRule3Test(){
        Trader trader = new Trader("Igor", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudRule3(transaction)){
            System.out.println("Rule 3 is fraud test PASS");
        }else{
            System.out.println("Rule 3 is fraud test FAIL");
        }
    }

    public void isNotFraudRule3Test(){
        Trader trader = new Trader("Vasja", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudRule3(transaction)){
            System.out.println("Rule 3 is not fraud test PASS");
        }else{
            System.out.println("Rule 3 is not fraud test FAIL");
        }
    }

    public void isFraudRule4Test(){
        Trader trader = new Trader("Vasja", "IDK", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudRule4(transaction)){
            System.out.println("Rule 4 is fraud test PASS");
        }else{
            System.out.println("Rule 4 is fraud test FAIL");
        }
    }

    public void isNotFraudRule4Test(){
        Trader trader = new Trader("Vasja", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudRule4(transaction)){
            System.out.println("Rule 4 is not fraud test PASS");
        }else{
            System.out.println("Rule 4 is not fraud test FAIL");
        }
    }

    public void isFraudRule5Test(){
        Trader trader = new Trader("Vasja", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudRule5(transaction)){
            System.out.println("Rule 5 is fraud test PASS");
        }else{
            System.out.println("Rule 5 is fraud test FAIL");
        }
    }

    public void isNotFraudRule5Test(){
        Trader trader = new Trader("Vasja", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudRule5(transaction)){
            System.out.println("Rule 5 is not fraud test PASS");
        }else{
            System.out.println("Rule 5 is not fraud test FAIL");
        }
    }
}
