package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5.task6_29;

class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();

        test.matchByAuthorTest();
        test.matchByTitleTest();
        test.matchByYearOfIssueTest();
        test.matchAndSearchCriteriaTest();
        test.matchOrSearchCriteriaTest();
    }

    public void matchByAuthorTest() {

        Book book = new Book("War and Peace", "Tolstoy");
        AuthorSearchCriteria searchCriteria = new AuthorSearchCriteria("Tolstoy");
        boolean resultOfAuthorSearchCriteria = searchCriteria.match(book);
        if (resultOfAuthorSearchCriteria) {
            System.out.println("Task16.TEST OK");
        } else {
            System.out.println("Task16.TEST FAILED");
        }
    }

    public void matchByTitleTest() {

        Book book = new Book("War and Peace", "Tolstoy");
        TitleSearchCriteria searchCriteria = new TitleSearchCriteria("War and Peace");
        boolean resultOfTitleSearchCriteria = searchCriteria.match(book);
        if (resultOfTitleSearchCriteria) {
            System.out.println("Task17.TEST OK");
        } else {
            System.out.println("Task17.TEST FAILED");
        }
    }

    public void matchByYearOfIssueTest() {

        Book book = new Book("War and Peace", "Tolstoy");
        book.setYearOfIssue("2002");
        YearOfIssueSearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2002");
        boolean resultYearOfIssueSearchCriteria = searchCriteria.match(book);
        if (resultYearOfIssueSearchCriteria) {
            System.out.println("Task18.TEST OK");
        } else {
            System.out.println("Task18.TEST FAILED");
        }
    }

    public void matchAndSearchCriteriaTest() {

        Book book = new Book("Zveroboi", "Kuper");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        AndSearchCriteria searchCriteria = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        boolean resultOfAndSearchCriteria = searchCriteria.match(book);
        if (resultOfAndSearchCriteria) {
            System.out.println("Task19.TEST OK");
        } else {
            System.out.println("Task19.TEST FAILED");
        }
    }

    public void matchOrSearchCriteriaTest() {

        Book book = new Book("Zveroboi", "Kuper");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        OrSearchCriteria searchCriteria = new OrSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        boolean resultOfOrSearchCriteria = searchCriteria.match(book);
        if (resultOfOrSearchCriteria) {
            System.out.println("Task20.TEST OK");
        } else {
            System.out.println("Task20.TEST FAILED");
        }
    }
}
