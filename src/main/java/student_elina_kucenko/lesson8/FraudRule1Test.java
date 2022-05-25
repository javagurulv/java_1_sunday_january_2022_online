package student_elina_kucenko.lesson8;

import java.util.ArrayList;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.rule1TestPokemon();
        fraudRule1Test.rule1TestNotPokemon();
    }

    public void rule1TestPokemon() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule1 rule = new FraudRule1("FraudRule1");
        if (rule.isFraud(transaction)) {
            System.out.println("Rule1: Test Pokemon - ok");
        } else {
            System.out.println("Rule1: Test Pokemon - false");
        }
    }

    public void rule1TestNotPokemon() {
        Trader trader = new Trader("Dimon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule1 rule = new FraudRule1("FraudRule1");
        if (!rule.isFraud(transaction)) {
            System.out.println("Rule1: Test Not Pokemon - ok");
        } else {
            System.out.println("Rule1: Test Not Pokemon - false");
        }
    }
}
