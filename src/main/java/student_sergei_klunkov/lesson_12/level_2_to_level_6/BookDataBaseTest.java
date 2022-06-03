package student_sergei_klunkov.lesson_12.level_2_to_level_6;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

class BookDataBaseTest {

    public static void main(String[] args) {
        BookDataBaseTest test = new BookDataBaseTest();
        test.saveIdTest();
        test.deleteIdTest();
        test.deleteBookTest();
        test.findBookByIdOptionalTest();
        test.findBookByAuthorTest();
        test.findBookByTitleTest();
        test.countAllBooksInLibraryTest();
        test.deleteAllBooksBySameAuthorTest();
        test.deleteAllBooksWithSameTitleTest();
        test.findBookByAndSearchCriteriaTest();
        test.findBookByOrSearchCriteriaTest();
        test.findUniqueAuthorsTest();
        test.findUniqueTitleTest();
        test.findUniqueBooksTest();
        test.containsBookTest();
        test.mapBooksByAuthorTest();
        test.countBookByAuthorTest();
    }


    public void saveIdTest() {
        Book book = new Book("A1", "B1");
        Long bookId = 1L;

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        Long expectedBookId = dataBase.save(book);
        if (bookId.equals(expectedBookId)){
            System.out.println(" Save Book ID " + " - Test passed! ");
        } else {
            System.out.println(" Save Book ID " + " - Test failed! ");
        }
    }

    public void deleteIdTest() {
        Book book = new Book("A1", "B1");
        book.setId(1L);

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        Long bookId = 1L;

        boolean bookToDeleteById = dataBase.delete(bookId);
        if (bookToDeleteById){
            System.out.println(" Delete Book ID " + " - Test passed! ");
        } else {
            System.out.println(" Delete Book ID " + " - Test failed! ");
        }
    }

    public void deleteBookTest(){
        Book SearchBook = new Book("A1", "B1");
        Book book = new Book("A1", "B1");
        Book book1 = new Book("A2", "B2");
        Book book2 = new Book("A3", "B3");
        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        boolean bookFoundToDelete = dataBase.delete(SearchBook);
        if (bookFoundToDelete) {
            System.out.println(" Delete book " + " - Test passed! ");
        } else {
            System.out.println(" Delete book " + " - Test failed! ");
        }
    }

    public void findBookByIdOptionalTest() {
        Book book = new Book("A1", "B1");
        book.setId(1L);
        BookDatabaseImpl database = new BookDatabaseImpl();
        List<Book> books = database.getBooks();
        books.add(book);
        Long bookId = 1L;

        Optional<Book> expectedResultToFindBookById = Optional.of(book);
        Optional<Book> resultOfFindById = database.findById(bookId);

        if (expectedResultToFindBookById.equals(resultOfFindById)){
            System.out.println(" Optional: Book founded by ID " + " - Test passed! ");
        } else {
            System.out.println(" Optional: Book founded by ID " + " - Test failed! ");
        }
    }

    public void findBookByAuthorTest() {

        String author = "A1";
        Book book = new Book("A1", "B1");

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> bookFoundByAuthorResult = dataBase.findByAuthor(author);
        if(books.equals(bookFoundByAuthorResult)) {
            System.out.println(" Book found by Author " + " - Test passed! ");
        } else {
            System.out.println(" Book found by Author " + " - Test failed! ");
        }
    }

    public void findBookByTitleTest() {

        String title = "B1";
        Book book = new Book("A1", "B1");

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> bookFoundByTitleResult = dataBase.findByTitle(title);
        if(books.equals(bookFoundByTitleResult)) {
            System.out.println(" Book found by Title " + " - Test passed! ");
        } else {
            System.out.println(" Book found by Title " + " - Test failed! ");
        }
    }

    public void countAllBooksInLibraryTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A2","B2");
        Book book2 = new Book("A3", "B3");
        int expectedCountBooksInLibrary = 3;

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        int actualResultOfCountingBooksInLibrary = dataBase.countAllBooks();

        if(actualResultOfCountingBooksInLibrary == expectedCountBooksInLibrary){
            System.out.println(" Counting books in library " + " - Test passed! ");
        } else {
            System.out.println(" Counting books in library " + " - Test failed! ");
        }
    }

    public void deleteAllBooksBySameAuthorTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A1", "B2");
        Book book2 = new Book("A3", "B3");

        String author = "A1";

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        int expectedSizeOfBooksInLibrary = 1;

        dataBase.deleteByAuthor(author);

        if(expectedSizeOfBooksInLibrary == books.size()) {
            System.out.println(" Delete all books by same Author " + " - Test passed! ");
        } else {
            System.out.println(" Delete all books by same Author " + " - Test failed! ");
        }
    }

    public void deleteAllBooksWithSameTitleTest() {
        Book book = new Book("A1", "B1");
        Book book1 = new Book("A2", "B2");
        Book book2 = new Book("A3", "B1");
        Book book3 = new Book("A4", "B4");

        String title = "B1";

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        int expectedSizeOfBooksInLibrary = 2;

        dataBase.deleteByTitle(title);

        if(expectedSizeOfBooksInLibrary == books.size()) {
            System.out.println(" Delete all books with same Title " + " - Test passed! ");
        } else {
            System.out.println(" Delete all books with same Title " + " - Test failed! ");
        }
    }

    public void findBookByAndSearchCriteriaTest() {
        Book book = new Book("Kuper", "Zveroboi");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> findBookByCriteria = dataBase.find(andSearchCriteria);
        if(books.equals(findBookByCriteria)){
            System.out.println(" Find book by AND Criteria " + " - Test passed! ");
        } else {
            System.out.println(" Find book by AND Criteria " + " - Test failed! ");
        }
    }

    public void findBookByOrSearchCriteriaTest() {
        Book book = new Book("Kuper", "Zveroboi");
        book.setYearOfIssue("1890");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> findBookByOrCriteria = dataBase.find(orSearchCriteria);
        if(books.equals(findBookByOrCriteria)) {
            System.out.println(" Find book by OR Criteria " + " - Test passed! ");
        } else {
            System.out.println(" Find book by OR Criteria " + " - Test failed! ");
        }
    }

    public void findUniqueAuthorsTest() {
        Book book = new Book("A1", "B1");
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Set<String> expectedUniqueAuthors = Set.of("A1", "A2", "A3");
        Set<String> actualResultOfUniqueAuthors = dataBase.findUniqueAuthors();
        if(expectedUniqueAuthors.equals(actualResultOfUniqueAuthors)) {
            System.out.println(" Find Unique Authors " + " - Test passed! ");
        } else {
            System.out.println(" Find Unique Authors " + " - Test failed! ");
        }
    }

    public void findUniqueTitleTest() {
        Book book = new Book("A1", "B1");
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Set<String> expectedBookTitles = Set.of("B1", "B2", "B3");
        Set<String> actualResultOfUniqueTitles = dataBase.findUniqueTitles();
        if(expectedBookTitles.equals(actualResultOfUniqueTitles)) {
            System.out.println(" Find Unique Titles " + " - Test passed! ");
        } else {
            System.out.println(" Find Unique Titles " + " - Test failed! ");
        }
    }

    public void findUniqueBooksTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A2", "B2");
        Book book2 = new Book("A3", "B3");

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);


        Set<Book> expectedUniqueBooksToFind = Set.of(
                new Book("A1", "B1"),
                new Book("A2", "B2"),
                new Book("A3", "B3") );
        Set<Book> resultOfFindingUniqueBooks = dataBase.findUniqueBooks();
        if(expectedUniqueBooksToFind.equals(resultOfFindingUniqueBooks)){
            System.out.println(" Find Unique Book " + " - Test passed! ");
        } else {
            System.out.println(" Find Unique Book " + " - Test faield! ");
        }
    }

    public void containsBookTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A2", "B2");
        Book book2 = new Book("A3", "B3");

        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        Book containedBook = new Book("A1", "B1");
        boolean resultOfBookWitchIsContained = dataBase.contains(containedBook);
        if (resultOfBookWitchIsContained) {
            System.out.println(" Contains Book " + " - Test passed! ");
        } else {
            System.out.println(" Contains Book " + " - Test failed! ");
        }
    }

    public void mapBooksByAuthorTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A1", "B2");
        Book book2 = new Book("A3", "B3");
        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        List<Book> firstBookList = List.of(
                new Book("A1", "B1"),
                new Book("A1", "B2")
        );

        List<Book> secondBookList = List.of(
                new Book("A3", "B3")
        );

        Map<String, List<Book>> expectedBooksByAuthor = Map.of("A1", firstBookList,
                "A3", secondBookList);

        Map<String, List<Book>> resultBookByAuthor = dataBase.getAuthorToBooksMap();
        if(expectedBooksByAuthor.equals(resultBookByAuthor)){
            System.out.println(" Map Books by Author " + " - Test passed! ");
        } else {
            System.out.println(" Map Books by Author " + " - Test failed! ");
        }
    }

    public void countBookByAuthorTest() {

        Book book = new Book("A1", "B1");
        Book book1 = new Book("A1", "B2");
        Book book2 = new Book("A2", "B3");
        Book book3 = new Book("A2", "B4");
        BookDatabaseImpl dataBase = new BookDatabaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Map<String, Integer> expectedCountOfBooksByAuthor = Map.of("A1", 2,"A2",2);
        Map<String, Integer> resultOfCountingBooksByAuthor = dataBase.getEachAuthorBookCount();
        if(expectedCountOfBooksByAuthor.equals(resultOfCountingBooksByAuthor)){
            System.out.println(" Count book by Author " + " - Test passed! ");
        } else {
            System.out.println(" Count book by Author " + " - Test failed! ");
        }
    }
}
