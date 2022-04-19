package student_yevgeniy_tolks.lesson_8.level_1;

class FraudDetector {

    boolean isFraudTrader(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    boolean isFraudTransactionAmount(Transaction transaction){
        return transaction.getAmount() > 100000;
    }
    boolean isFraudTraderCity(Transaction transaction){
        Trader trader = transaction.getTrader();
        return  trader.getCity().equals("Sydney");

    }
    boolean isFraudTraderCountry(Transaction transaction){
        Trader trader = transaction.getTrader();
        return  trader.getCountry().equals("Jamaica");
    }
}