package student_sergei_klunkov.lessson_12.level_2.task_6;


import java.util.List;
import java.util.Optional;

class BookDataBaseTest {

    public static void main(String[] args) {
        BookDataBaseTest test = new BookDataBaseTest();
        test.saveIdTest();
        test.deleteIdTest();
        test.deleteBookTest();
        test.findBookByIdOptionalTest();
        test.findBookByAuthor();
        test.findBookByTitle();

    }


    public void saveIdTest() {
        Book book = new Book("A1", "B1");
        Long bookId = 1L;

        BookDataBaseImpl dataBase = new BookDataBaseImpl();
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

        BookDataBaseImpl dataBase = new BookDataBaseImpl();
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
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
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
        BookDataBaseImpl database = new BookDataBaseImpl();
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

    public void findBookByAuthor() {

        String author = "A1";
        Book book = new Book("A1", "B1");

        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> bookFoundByAuthorResult = dataBase.findByAuthor(author);
        if(books.equals(bookFoundByAuthorResult)) {
            System.out.println(" Book found by Author " + " - Test passed! ");
        } else {
            System.out.println(" Book found by Author " + " - Test failed! ");
        }
    }

    public void findBookByTitle() {

        String title = "B1";
        Book book = new Book("A1", "B1");

        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        List<Book> books = dataBase.getBooks();
        books.add(book);

        List<Book> bookFoundByTitleResult = dataBase.findByTitle(title);
        if(books.equals(bookFoundByTitleResult)) {
            System.out.println(" Book found by Title " + " - Test passed! ");
        } else {
            System.out.println(" Book found by Title " + " - Test failed! ");
        }
    }



}
