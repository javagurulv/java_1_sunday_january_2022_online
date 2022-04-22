package student_elina_kucenko.lesson8;

class FraudDetectorRule1 {

    boolean isFraud(Transaction t) {

        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }
}
