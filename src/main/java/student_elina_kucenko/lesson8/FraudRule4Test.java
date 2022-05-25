package student_elina_kucenko.lesson8;

public class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.rule4TestJamaica();
        fraudRule4Test.rule4TestNotJamaica();
    }

    public void rule4TestJamaica() {
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule4 rule = new FraudRule4("FraudRule4");
        if (rule.isFraud(transaction)) {
            System.out.println("Rule4: Test Jamaica - ok");
        } else {
            System.out.println("Rule4: Test Jamaica - false");
        }
    }

    public void rule4TestNotJamaica() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule4 rule = new FraudRule4("FraudRule4");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule4: Test Not Jamaica -ok");
        } else {
            System.out.println("Rule4: Test Not Jamaica - false");
        }
    }
}
