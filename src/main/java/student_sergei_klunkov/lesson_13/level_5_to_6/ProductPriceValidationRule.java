package student_sergei_klunkov.lesson_13.level_5_to_6;

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
