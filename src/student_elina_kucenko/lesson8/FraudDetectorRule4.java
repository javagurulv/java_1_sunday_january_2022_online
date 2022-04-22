package student_elina_kucenko.lesson8;

class FraudDetectorRule4 {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }
}
