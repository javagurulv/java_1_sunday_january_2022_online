package student_devids_kropacovs.lesson13.level5;

class ProductPriceValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be Empty", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price can not be Zero or negative", "price");
        }
    }
}
