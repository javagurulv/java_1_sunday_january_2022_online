package student_sergei_klunkov.lesson_12.level_2_to_level_6;


class SearchCriteriaDemo {

    public static void main(String[] args) {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria1 = new YearOfIssueSearchCriteria("1890");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria1);

    }
}
