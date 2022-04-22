package student_elina_kucenko.lesson8;

class FraudDetectorRule2 {

    boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        } else {
            return false;
        }
    }
}
