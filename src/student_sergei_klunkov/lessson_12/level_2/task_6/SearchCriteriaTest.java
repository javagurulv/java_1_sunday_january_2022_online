package student_sergei_klunkov.lessson_12.level_2.task_6;

class SearchCriteriaTest {

    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.matchByAuthor();
        test.matchByTitle();
        test.matchByYearIfIssue();
        test.matchByAndSearchCriteria();
        test.matchByOrSearchCriteria();
    }

    public void matchByAuthor() {
        Book book = new Book("A1", "B1");
        SearchCriteria searchCriteria = new AuthorSearchCriteria("A1");
        boolean resultOfSearchingCriteriaByAuthor = searchCriteria.match(book);
        if(resultOfSearchingCriteriaByAuthor) {
            System.out.println(" Match by Author " + " - Test passed! ");
        } else {
            System.out.println(" Match by Author " + " - Test failed! ");
        }
    }

    public void matchByTitle() {
        Book book = new Book("A1", "B1");
        SearchCriteria searchCriteria = new TitleSearchCriteria("B1");
        boolean resultOfMatchingCriteriaByTitle = searchCriteria.match(book);
        if (resultOfMatchingCriteriaByTitle) {
            System.out.println(" Match by Title " + " - Test passed! ");
        } else {
            System.out.println(" Match by Title " + " - Test failed! ");
        }
    }

    public void matchByYearIfIssue() {
        Book book = new Book("A1", "B1");
        book.setYearOfIssue("1999");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("1999");
        boolean resultOfMatchingByYearOfIssue = searchCriteria.match(book);
        if (resultOfMatchingByYearOfIssue) {
            System.out.println(" Match by Year Of Issue " + " - Test passed! ");
        } else {
            System.out.println(" Match by Year Of Issue " + " - Test failed! ");
        }
    }

    public void matchByAndSearchCriteria() {
        Book book = new Book("A1", "B2");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        boolean resultOfAndSearchCriteria = andSearchCriteria.match(book);
        if (resultOfAndSearchCriteria) {
            System.out.println(" And Search Criteria " + " - Test passed! ");
        } else {
            System.out.println(" And Search Criteria " + " - Test failed! ");
        }
    }

    public void matchByOrSearchCriteria() {
        Book book = new Book("A1", "B2");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B4");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        boolean resultOfOrSearchCriteria = orSearchCriteria.match(book);
        if (resultOfOrSearchCriteria) {
            System.out.println(" OR Search Criteria " + " - Test passed! ");
        } else {
            System.out.println(" OR Search Criteria " + " - Test failed! ");
        }
    }


}
