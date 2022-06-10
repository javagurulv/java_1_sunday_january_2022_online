package student_devids_kropacovs.lesson13.level5;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator{
    private ProductTitleValidationRule titleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}

