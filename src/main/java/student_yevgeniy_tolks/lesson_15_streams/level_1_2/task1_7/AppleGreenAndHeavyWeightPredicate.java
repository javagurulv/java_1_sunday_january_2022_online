package student_yevgeniy_tolks.lesson_15_streams.level_1_2.task1_7;

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
