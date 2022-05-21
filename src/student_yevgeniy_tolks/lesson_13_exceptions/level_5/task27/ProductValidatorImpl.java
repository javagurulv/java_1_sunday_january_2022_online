package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

private ProductTitleValidationRule productTitleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule productTitleValidationRule) {
        this.productTitleValidationRule = productTitleValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {

        List<ValidationException> exceptions = new ArrayList<>();
        try {
            productTitleValidationRule.validate(product);
        } catch (ValidationException e){
            exceptions.add(e);
        }
         return exceptions;
    }
}
