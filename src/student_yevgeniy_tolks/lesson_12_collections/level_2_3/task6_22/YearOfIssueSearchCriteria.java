package student_yevgeniy_tolks.lesson_12_collections.level_2_3.task6_22;

import java.util.Objects;

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
