package student_yevgeniy_tolks.lesson_13_exceptions.level_5_6.task27_46;

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
