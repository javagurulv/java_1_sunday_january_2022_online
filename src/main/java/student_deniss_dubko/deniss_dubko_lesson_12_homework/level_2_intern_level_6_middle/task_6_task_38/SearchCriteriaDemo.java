package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Head First Java");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kathy Sierra");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2005");
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria1 = new YearOfIssueSearchCriteria("2005");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria1);
    }

}