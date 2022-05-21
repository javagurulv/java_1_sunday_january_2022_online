package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private final List<ValidationException> validationExceptionArrayList = new ArrayList<>();

    @Override
    public List<ValidationException> validate(Product product) {
        return null;
    }
}
