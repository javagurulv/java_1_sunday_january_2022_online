package student_deniss_dubko.deniss_dubko_lesson_15_homework.level_1_level_2_intern;

class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

}