package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

class BookDataBaseImplTest {
    public static void main(String[] args) {
        BookDataBaseImplTest test = new BookDataBaseImplTest();
        test.saveTest();
        test.deleteBookByIdTest();
        test.deleteBookTest();
        test.optionalFindByIdTest();
        test.findBookByAuthor();
        test.findBookByTitle();
        test.countBooksInList();
        test.deleteByAuthorTest();
        test.deleteByTitleTest();
        test.findBookByOrCriteriaTest();
        test.findBookByAndCriteriaTest();
        test.uniqueAuthorsFindTest();
        test.uniqueTitleFindTest();
        test.uniqueBookFindTest();
        test.containsABookTest();
        test.mapBooksByAuthorTest();
        test.countBooksByAuthorTest();
    }

    public void saveTest() {
        Book book = new Book("Tolstoy", "War and peace");
        Long bookId = 1L;

        BookDataBaseImpl impl = new BookDataBaseImpl();
        Long expectedBookID = impl.save(book);
        if (bookId.equals(expectedBookID)) {
            System.out.println("Task6.TEST OK");
        } else {
            System.out.println("Task6.TEST FAILED");
        }
    }

    public void deleteBookByIdTest() {
        Book book = new Book("Tolstoy", "War and Peace");
        book.setId(1L);

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        Long bookById = 1L;

        boolean bookToDeleteById = impl.delete(bookById);
        if (bookToDeleteById) {
            System.out.println("Task7.TEST OK");
        } else {
            System.out.println("Task7.TEST FAILED");
        }
    }

    public void deleteBookTest() {
        Book SearchBook = new Book("Tolstoy", "War and Peace");
        Book book = new Book("Tolstoy", "War and Peace Vol1");
        Book book1 = new Book("Turgenev", "Father and Sons");
        Book book2 = new Book("Tolstoy", "War and Peace");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        boolean bookFoundToDelete = impl.delete(SearchBook);
        if (bookFoundToDelete) {
            System.out.println("Task8.TEST OK");
        } else {
            System.out.println("Task8.TEST FAILED");
        }
    }

    public void optionalFindByIdTest() {
        Book book = new Book("Turgenev", "Father and Sons");
        book.setId(1L);
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        Long bookId = 1L;

        Optional<Book> expectedToFindBookByID = Optional.of(book);
        Optional<Book> resultOfBookFoundById = impl.findById(bookId);

        if (expectedToFindBookByID.equals(resultOfBookFoundById)) {
            System.out.println("Task9.TEST OK");
        } else {
            System.out.println("Task9.TEST FAILED");
        }
    }

    public void findBookByAuthor() {
        String author = "Turgenev";
        Book book = new Book("Father and Sons", "Turgenev");

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);

        List<Book> resultBookFoundByAuthor = impl.findByAuthor(author);
        if (books.equals(resultBookFoundByAuthor)) {
            System.out.println("Task10.TEST OK");
        } else {
            System.out.println("Task10.TEST FAILED");
        }
    }

    public void findBookByTitle() {
        String title = "Father and Sons";
        Book book = new Book("Father and Sons", "Turgenev");

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);

        List<Book> resultBookFoundByTitle = impl.findByTitle(title);
        if (books.equals(resultBookFoundByTitle)) {
            System.out.println("Task11.TEST OK");
        } else {
            System.out.println("Task11.TEST FAILED");
        }
    }

    public void countBooksInList() {
        Book book = new Book("Father and Sons", "Turgenev");
        Book book1 = new Book("Master and Margaritta", "Bulhakov");
        Book book2 = new Book("War and peace", "Tolstoy");
        int expectedBooksInTheList = 3;

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);

        int resultBooksInTheList = impl.countAllBooks();
        if (expectedBooksInTheList == resultBooksInTheList) {
            System.out.println("Task12.TEST OK");
        } else {
            System.out.println("Task12.TEST FAILED");
        }
    }

    public void deleteByAuthorTest() {
        Book book = new Book("Father and Sons", "Turgenev");
        Book book1 = new Book("Master and Margaritta", "Bulhakov");
        Book book2 = new Book("War and peace", "Tolstoy");
        String author = "Tolstoy";

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book2);
        int expectedListSize = 2;
        impl.deleteByAuthor(author);

        if (books.size() == expectedListSize) {
            System.out.println("Task13.TEST OK");
        } else {
            System.out.println("Task13.TEST FAILED");
        }
    }

    public void deleteByTitleTest() {
        Book book = new Book("Father and Sons", "Turgenev");
        Book book1 = new Book("Master and Margaritta", "Bulhakov");
        Book book2 = new Book("War and peace", "Tolstoy");
        String title = "Father and Sons";

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book);
        books.add(book1);
        books.add(book1);
        books.add(book2);
        books.add(book2);

        int expectedListSize = 4;
        impl.deleteByTitle(title);

        if (books.size() == expectedListSize) {
            System.out.println("Task14.TEST OK");
        } else {
            System.out.println("Task14.TEST FAILED");
        }
    }

    public void findBookByOrCriteriaTest() {
        Book book = new Book("Zveroboi", "Kuper");
        book.setYearOfIssue("1890");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        YearOfIssueSearchCriteria yearOfIssueCriteriaSearch = new YearOfIssueSearchCriteria("1890");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueCriteriaSearch);

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);

        List<Book> findBookByCriteria = impl.find(orSearchCriteria);
        if (books.equals(findBookByCriteria)) {
            System.out.println("Task22.TEST OK");
        } else {
            System.out.println("Task22.TEST FAILED");
        }

    }

    public void findBookByAndCriteriaTest() {
        Book book = new Book("Zveroboi", "Kuper");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);

        List<Book> findBookByCriteria = impl.find(andSearchCriteria);
        if (books.equals(findBookByCriteria)) {
            System.out.println("Task22.v2.TEST OK");
        } else {
            System.out.println("Task22.v2.TEST FAILED");
        }
    }

    public void uniqueAuthorsFindTest() {
        Book book = new Book("Zveroboi", "Kuper");
        Book book1 = new Book("Zveroboi", "Kuper");
        Book book2 = new Book("War and peace", "Tolstoy");
        Book book3 = new Book("Master an Margaritta", "Bulgakov");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Set<String> expectedUniqueAuthors = Set.of("Kuper", "Tolstoy", "Bulgakov");
        Set<String> resultOfFoundUniqueAuthors = impl.findUniqueAuthors();
        if (expectedUniqueAuthors.equals(resultOfFoundUniqueAuthors)) {
            System.out.println("Task23. Test OK");
        } else {
            System.out.println("Task23.TEST FAILED");
        }
    }

    public void uniqueTitleFindTest() {

        Book book = new Book("Zveroboi", "Kuper");
        Book book1 = new Book("Zveroboi", "Kuper");
        Book book2 = new Book("War and peace", "Tolstoy");
        Book book3 = new Book("Master and Margaritta", "Bulgakov");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Set<String> expectedUniqueTitle = Set.of(
                "Zveroboi",
                "War and peace",
                "Master and Margaritta");
        Set<String> resultOfFoundUniqueTitle = impl.findUniqueTitles();
        if (expectedUniqueTitle.equals(resultOfFoundUniqueTitle)) {
            System.out.println("Task24. Test OK");
        } else {
            System.out.println("Task24.TEST FAILED");
        }
    }

    public void uniqueBookFindTest() {

        Book book = new Book("Zveroboi", "Kuper");
        Book book1 = new Book("Zveroboi", "Kuper");
        Book book2 = new Book("War and peace", "Tolstoy");
        Book book3 = new Book("Master and Margaritta", "Bulgakov");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Set<Book> expectedUniqueBookFind = Set.of(
                new Book("Zveroboi", "Kuper"),
                new Book("War and peace", "Tolstoy"),
                new Book("Master and Margaritta", "Bulgakov")
        );
        Set<Book> resultOfUniqueBookFind = impl.findUniqueBooks();
        if (expectedUniqueBookFind.equals(resultOfUniqueBookFind)) {
            System.out.println("Task25.TEST OK");
        } else {
            System.out.println("Task25. TEST FAILED");
        }
    }

    public void containsABookTest() {
        Book book1 = new Book("Zveroboi", "Kuper");
        Book book2 = new Book("War and peace", "Tolstoy");
        Book book3 = new Book("Master and Margaritta", "Bulgakov");

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Book containedBook = new Book("War and peace", "Tolstoy");
        boolean resultOfContainedBook = impl.contains(containedBook);
        if (resultOfContainedBook) {
            System.out.println("Task26.TEST OK");
        } else {
            System.out.println("Task26.TEST FAILED");
        }
    }

    public void mapBooksByAuthorTest() {

        Book book1 = new Book("War and Peace Vol1", "Tolstoy");
        Book book2 = new Book("War and Peace Vol2", "Tolstoy");
        Book book3 = new Book("Zveroboi", "Kuper");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book1);
        books.add(book2);
        books.add(book3);


        List<Book> bookList1 = List.of(
                new Book("War and Peace Vol1", "Tolstoy"),
                new Book("War and Peace Vol2", "Tolstoy")

        );
        List<Book> bookList2 = List.of(
                new Book("Zveroboi", "Kuper")
        );

        Map<String, List<Book>> expectedBooksByAuthor = Map.of(
                "Tolstoy", bookList1,
                "Kuper", bookList2);

        Map<String, List<Book>> resultBooksByAuthor = impl.getAuthorToBooksMap();
        if (expectedBooksByAuthor.equals(resultBooksByAuthor)) {
            System.out.println("Task28.TEST OK");
        } else {
            System.out.println("Task28.TEST FAILED");
        }
    }

    public void countBooksByAuthorTest() {

        Book book1 = new Book("War and Peace Vol1", "Tolstoy");
        Book book2 = new Book("War and Peace Vol2", "Tolstoy");
        Book book3 = new Book("Zveroboi", "Kuper");
        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Map<String, Integer> expectedCountOfBooksByAuthor = Map.of(
                "Tolstoy", 2,
                "Kuper", 1);

        Map<String, Integer> resultCountOfBooksByAuthor = impl.getEachAuthorBookCount();
        if (expectedCountOfBooksByAuthor.equals(resultCountOfBooksByAuthor)) {
            System.out.println("Task29.TEST OK");
        } else {
            System.out.println("Task29.TEST FAILED");
        }
    }
}
