package student_sergei_klunkov.lesson_13.level_5_to_6;

class ProductTitleValidationRule implements FieldValidationRules {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductTitle() == null || product.getProductTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be Empty", "title");
        } else if (product.getProductTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        } else if (product.getProductTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        } else if (!product.getProductTitle().matches("^[a-zA-Z0-9 ]+$")) {
            throw new ValidationException("RULE-4", "Title should have english letters and numbers", "title");
        }

    }
}
