package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

class ValidationException extends Exception {
    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String ruleName, String description,String fieldName){
        this.ruleName=ruleName;
        this.description=description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
