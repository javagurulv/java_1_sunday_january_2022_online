package student_devids_kropacovs.lesson8.level1;

public class FraudDetector {

    boolean isFraud(Transaction t) {
        return true;
    }

    public boolean isFraudRule1(Transaction t){
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    public boolean isFraudRule2(int amount){
        return amount >= 1000000;
    }

    public  boolean isFraudRule3(Transaction t){
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sidney");
    }

    public  boolean isFraudRule4(Transaction t){
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    public  boolean isFraudRule5(Transaction t){
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Germany") && t.getAmount() >= 1000;
    }
}
