package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
