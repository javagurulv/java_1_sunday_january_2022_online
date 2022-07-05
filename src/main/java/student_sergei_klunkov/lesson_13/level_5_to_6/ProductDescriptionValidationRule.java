package student_sergei_klunkov.lesson_13.level_5_to_6;

class ProductDescriptionValidationRule implements FieldValidationRules {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "To long product description content", "description");
        } else if (!product.getProductDescription().matches("^[a-zA-Z0-9 ]+$")) {
            throw new ValidationException("RULE-8", "Description should have english letters and numbers", "description");
        }
    }
}
