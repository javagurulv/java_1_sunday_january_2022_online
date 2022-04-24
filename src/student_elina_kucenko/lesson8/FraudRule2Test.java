package student_elina_kucenko.lesson8;

public class FraudRule2Test {

    public static void main(String[] args) {

        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.rule2TestMoreThanMillion();
        fraudRule2Test.rule2TestEqualsMillion();
        fraudRule2Test.rule2TestLessThanMillion();
    }

    public void rule2TestMoreThanMillion() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule2 rule = new FraudRule2("FraudRule2");
        if (rule.isFraud(transaction)) {
            System.out.println("Rule2: Test More Than Million - ok");
        } else {
            System.out.println("Rule2: Test More Than Million - false");
        }
    }

    public void rule2TestEqualsMillion() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 rule = new FraudRule2("FraudRule2");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule2: Test Equals Million - ok");
        } else {
            System.out.println("Rule2: Test Equals Million - false");
        }
    }

    public void rule2TestLessThanMillion() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        FraudRule2 rule = new FraudRule2("FraudRule2");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule2: Test Less Than Million - ok");
        } else {
            System.out.println("Rule2: Test Less Than Million - false");
        }
    }
}
