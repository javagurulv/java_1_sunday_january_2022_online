package student_yevgeniy_tolks.lesson_15_streams.level_1_2.task1_7;

class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
