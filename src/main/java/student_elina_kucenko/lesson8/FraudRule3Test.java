package student_elina_kucenko.lesson8;

public class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.rule3TestSydney();
        fraudRule3Test.rule3TestNotSydney();
    }

    public void rule3TestSydney() {
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule3 rule = new FraudRule3("FraudRule3");
        if (rule.isFraud(transaction)) {
            System.out.println("Rule3: Test Sydney - ok");
        } else {
            System.out.println("Rule3:Test Sydney - false");
        }
    }

    public void rule3TestNotSydney() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule3 rule = new FraudRule3("FraudRule3");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule3:Test Not Sydney - ok");
        } else {
            System.out.println("Rule3:Test Not Sydney - false");
        }
    }
}
