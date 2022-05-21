package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.util.ArrayList;
import java.util.List;

class ProductTitleValidationRule implements FieldValidationRules {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be Empty", "title");
        } else if (product.getProductTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        } else if (product.getProductTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        }
    }
}
