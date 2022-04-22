package student_elina_kucenko.lesson8;

class FraudDetector {

    boolean isFraud(Transaction t) {
        FraudDetectorRule1 fraudDetectorRule1 = new FraudDetectorRule1();
        FraudDetectorRule2 fraudDetectorRule2 = new FraudDetectorRule2();
        FraudDetectorRule3 fraudDetectorRule3 = new FraudDetectorRule3();
        FraudDetectorRule4 fraudDetectorRule4 = new FraudDetectorRule4();
        return fraudDetectorRule1.isFraud(t) ||
                fraudDetectorRule2.isFraud(t) ||
                fraudDetectorRule3.isFraud(t) ||
                fraudDetectorRule4.isFraud(t);
    }
}
