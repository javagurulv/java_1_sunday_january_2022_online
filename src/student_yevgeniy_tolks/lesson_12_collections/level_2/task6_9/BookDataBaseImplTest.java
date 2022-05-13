package student_yevgeniy_tolks.lesson_12_collections.level_2.task6_9;

import java.util.List;
import java.util.Optional;

class BookDataBaseImplTest {
    public static void main(String[] args) {
        BookDataBaseImplTest test = new BookDataBaseImplTest();
        test.saveTest();
        test.deleteBookByIdTest();
        test.deleteBookTest();
        test.optionalFindByIdTest();
        test.findBookByAuthor();
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
}
