package student_deniss_dubko.deniss_dubko_lesson_8_homework.level_1_intern_level_6_middle;

class FraudDetector {

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

}