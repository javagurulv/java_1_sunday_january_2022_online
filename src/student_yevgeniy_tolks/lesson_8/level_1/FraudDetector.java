package student_yevgeniy_tolks.lesson_8.level_1;

class FraudDetector {

    boolean isFraud(Transaction transaction,Trader trader) {
        return transaction != null && trader.getFullName().equals("Pokemon");
    }

    boolean isFraudAttempt(Transaction transaction){
        return transaction.getAmount() > 100000;
    }
}