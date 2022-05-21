package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
