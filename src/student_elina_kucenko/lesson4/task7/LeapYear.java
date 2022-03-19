package student_elina_kucenko.lesson4.task7;

class LeapYear {


    public boolean isLapYear(int year) {
        if (!isDividedBy4(year)) {
            return false;
        } else if (!isDividedBy100(year)) {
            return true;
        } else if ((isDividedBy400(year))) {
            return true;
        }
        return false;
    }


    private boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }

}
