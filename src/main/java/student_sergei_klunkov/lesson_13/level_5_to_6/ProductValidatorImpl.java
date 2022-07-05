package student_sergei_klunkov.lesson_13.level_5_to_6;

import java.util.ArrayList;
import java.util.List;
class ProductValidatorImpl implements ProductValidator {

    private List<FieldValidationRules> validationRules = new ArrayList<>();
    private ProductTitleValidationRule productTitleValidationRule;
    private ProductPriceValidationRule productPriceValidationRule;
    private ProductDescriptionValidationRule productDescriptionValidationRule;
    public ProductValidatorImpl(ProductTitleValidationRule productTitleValidationRule,
                                ProductPriceValidationRule productPriceValidationRule,
                                ProductDescriptionValidationRule productDescriptionValidationRule) {
        validationRules.add(productTitleValidationRule);
        validationRules.add(productPriceValidationRule);
        validationRules.add(productDescriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRules fieldValidationRule : validationRules) {
            try {
                fieldValidationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
