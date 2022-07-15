package student_deniss_dubko.deniss_dubko_lesson_15_homework.level_1_level_2_intern;

class AppleRedColourPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }

}