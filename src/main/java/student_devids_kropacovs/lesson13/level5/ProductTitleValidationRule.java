package student_devids_kropacovs.lesson13.level5;

class ProductTitleValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be Empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        } else if (!product.getTitle().matches("^[a-zA-Z0-9 ]+$")) {
            throw new ValidationException("RULE-4", "Title should have english letters and numbers", "title");
        }
    }
}
