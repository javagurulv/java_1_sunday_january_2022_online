package student_sergei_klunkov.lessson_12.level_2.task_6;

class OrSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
       return leftCondition.match(book) || rightCondition.match(book);
    }
}
