package student_stanislav_astafjev.lesson_4.Task_23;

class LeapYear {
    public boolean isLeapYear (int year) {
        if (!isDevidedBy4(year)) {
            return false;
        }
        if (!isDevidedBy100(year)) {
            return true;
        }
        return isDevidedBy400(year);
    }
    private boolean isDevidedBy4(int year) {
        return year % 4 == 0;
    }
    private boolean isDevidedBy100(int year) {
        return year % 100 == 0;
    }
    private boolean isDevidedBy400(int year) {
        return year % 400 == 0;
    }
}

