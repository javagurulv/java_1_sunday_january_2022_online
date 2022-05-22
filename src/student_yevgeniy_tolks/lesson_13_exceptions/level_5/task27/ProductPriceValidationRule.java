package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.math.BigDecimal;

class ProductPriceValidationRule implements FieldValidationRules {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be Empty", "price");
        } else if (product.getProductPrice().equals(BigDecimal.ZERO)) {
            throw new ValidationException("RULE-6", "Price can not be Zero", "price");
        }
    }
}
