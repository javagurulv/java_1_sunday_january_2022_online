package student_alina_strumpe._lesson_4_if._level_7_Task_23;

public class LeapYear {

    boolean leapYear = true;
    boolean year = false;
    boolean usualYear;

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0) && !(year % 100 == 0)) {     // тут никогда не будет правдой
            final boolean b = true;
            return leapYear;
        } else if ((year % 100 == 0) || (year % 400 == 0)) {
            return leapYear;
        } else {
            return false;
        }
    }

}

//    // return true - если год високосный
//    // return false - если год обычный
//    public boolean isLeapYear(int year) {
//        // Если год не делится на 4, значит он обычный.      !(year % 4 ==0) - обычный
//        // Иначе надо проверить не делится ли год на 100.       (year % 100 == 0 - обычный  // !(year % 100 == 0) - высокосный
//        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
//        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400. (year % 400 == 0)- высокосный   !(year % 400 == 0)  обычный
//        // Если год делится на 400, то он високосный.
//        // Иначе год обычный.
//    }
//
//}
//
//Создать класс для тестов LeapYearTest
//        и покрыть тестами весь функционал класса LeapYear.