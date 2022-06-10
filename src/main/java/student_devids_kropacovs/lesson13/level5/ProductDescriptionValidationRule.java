package student_devids_kropacovs.lesson13.level5;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description content is too long should be less than 2000 char.", "description");
        } else if (!product.getDescription().matches("^[a-zA-Z0-9 ]+$")) {
            throw new ValidationException("RULE-8", "Description should have English letters and numbers", "description");
        }
    }
}
