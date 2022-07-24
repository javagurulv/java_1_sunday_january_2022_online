package student_stanislav_astafjev.lesson_8.task_1;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Russia") && transaction.getAmount() >10000;
    }

}
