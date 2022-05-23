package student_yevgeniy_tolks.lesson_13_exceptions.level_5_6.task27_46;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule productTitleValidationRule;
    private ProductPriceValidationRule productPriceValidationRule;
    private ProductDescriptionValidationRule productDescriptionValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule productTitleValidationRule,
                                ProductPriceValidationRule productPriceValidationRule,
                                ProductDescriptionValidationRule productDescriptionValidationRule) {
        this.productTitleValidationRule = productTitleValidationRule;
        this.productPriceValidationRule = productPriceValidationRule;
        this.productDescriptionValidationRule = productDescriptionValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {

        List<ValidationException> exceptions = new ArrayList<>();
        try {
            productTitleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            productPriceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            productDescriptionValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }
}
