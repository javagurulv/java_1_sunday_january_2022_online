package student_yevgeniy_tolks.lesson_12_collections.level_2_3.task6_22;

class SearchCriteriaDemo {
    public static void main(String[] args) {

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria= new YearOfIssueSearchCriteria("1890");
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria1 = new YearOfIssueSearchCriteria("1890");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria1);
    }

}
