package student_elina_kucenko.lesson8;

class FraudDetectorRule3 {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney")) {
            return true;
        } else {
            return false;
        }
    }
}
