package student_yevgeniy_tolks.lesson_13_exceptions.level_5_6.task27_46;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
