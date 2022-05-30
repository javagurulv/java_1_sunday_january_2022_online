package student_devids_kropacovs.lesson12.level2_7;

class AuthorSearchCriteriaTest {
    public static void main(String[] args) {
        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.matchTestByAuthorFalseTest();
        authorSearchCriteriaTest.matchTestByAuthorTrueTest();
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
}
