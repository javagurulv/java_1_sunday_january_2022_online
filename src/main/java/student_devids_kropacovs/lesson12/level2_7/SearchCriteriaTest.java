package student_devids_kropacovs.lesson12.level2_7;

class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest searchCriteriaTest = new SearchCriteriaTest();
        searchCriteriaTest.matchTestByAuthorFalseTest();
        searchCriteriaTest.matchTestByAuthorTrueTest();
        searchCriteriaTest.matchTestByTitleTrueTest();
        searchCriteriaTest.matchTestByTitleFalseTest();
        searchCriteriaTest.matchTestByYearOfIssueFalseTest();
        searchCriteriaTest.matchTestByYearOfIssueTrueTest();
        searchCriteriaTest.matchTestByTwoCriteriaTestFalse();
        searchCriteriaTest.matchTestByTwoCriteriaTestTrue();
        searchCriteriaTest.matchTestByOneOfTwoCriteriaTestFalse();
        searchCriteriaTest.matchTestByOneOfTwoCriteriaTestTrue();

    }

    public void matchTestByAuthorTrueTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new AuthorSearchCriteria("John");
        if(searchCriteria.match(book)){
            System.out.println("Match true test by author PASS");
        }else{
            System.out.println("Match true test by author FAIL");
        }
    }

    public void matchTestByAuthorFalseTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Andy");
        if(!searchCriteria.match(book)){
            System.out.println("Match false test by author PASS");
        }else{
            System.out.println("Match false test by author FAIL");
        }
    }

    public void matchTestByTitleTrueTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new TitleSearchCriteria("Java");
        if(searchCriteria.match(book)){
            System.out.println("Match true test by title PASS");
        }else{
            System.out.println("Match true test by title FAIL");
        }
    }

    public void matchTestByTitleFalseTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new TitleSearchCriteria("Java2.0");
        if(!searchCriteria.match(book)){
            System.out.println("Match false test by title PASS");
        }else{
            System.out.println("Match false test by title FAIL");
        }
    }

    public void matchTestByYearOfIssueTrueTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2020");
        book.setYearOfIssue("2020");
        if(searchCriteria.match(book)){
            System.out.println("Match true test by Year of Issue PASS");
        }else{
            System.out.println("Match true test by Year of Issue FAIL");
        }
    }

    public void matchTestByYearOfIssueFalseTest(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2020");
        book.setYearOfIssue("2021");
        if(!searchCriteria.match(book)){
            System.out.println("Match false test by Year of Issue PASS");
        }else{
            System.out.println("Match false test by Year of Issue FAIL");
        }
    }

    public void matchTestByTwoCriteriaTestTrue(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteriaLeft = new TitleSearchCriteria("Java");
        SearchCriteria searchCriteriaRight = new AuthorSearchCriteria("John");
        SearchCriteria searchCriteria = new AndSearchCriteria(searchCriteriaLeft,searchCriteriaRight);
        if(searchCriteria.match(book)){
            System.out.println("Match true test by Two criteria PASS");
        }else{
            System.out.println("Match true test by Two criteria FAIL");
        }
    }

    public void matchTestByTwoCriteriaTestFalse(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteriaLeft = new TitleSearchCriteria("Java");
        SearchCriteria searchCriteriaRight = new AuthorSearchCriteria("Jo");
        SearchCriteria searchCriteria = new AndSearchCriteria(searchCriteriaLeft,searchCriteriaRight);
        if(!searchCriteria.match(book)){
            System.out.println("Match false test by Two criteria PASS");
        }else{
            System.out.println("Match false test by Two criteria FAIL");
        }
    }

    public void matchTestByOneOfTwoCriteriaTestTrue(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteriaLeft = new TitleSearchCriteria("Java");
        SearchCriteria searchCriteriaRight = new AuthorSearchCriteria("Jo");
        SearchCriteria searchCriteria = new OrSearchCriteria(searchCriteriaLeft,searchCriteriaRight);
        if(searchCriteria.match(book)){
            System.out.println("Match true test by One of Two criteria PASS");
        }else{
            System.out.println("Match true test by One of Two criteria FAIL");
        }
    }

    public void matchTestByOneOfTwoCriteriaTestFalse(){
        Book book = new Book("John", "Java");
        SearchCriteria searchCriteriaLeft = new TitleSearchCriteria("Ja");
        SearchCriteria searchCriteriaRight = new AuthorSearchCriteria("Jo");
        SearchCriteria searchCriteria = new OrSearchCriteria(searchCriteriaLeft,searchCriteriaRight);
        if(!searchCriteria.match(book)){
            System.out.println("Match false test by One of Two criteria PASS");
        }else{
            System.out.println("Match false test by One of Two criteria FAIL");
        }
    }
}
