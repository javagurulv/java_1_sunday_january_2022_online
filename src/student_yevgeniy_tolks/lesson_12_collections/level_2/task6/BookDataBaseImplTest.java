package student_yevgeniy_tolks.lesson_12_collections.level_2.task6;
import java.util.List;

class BookDataBaseImplTest {
    public static void main(String[] args) {
        BookDataBaseImplTest test = new BookDataBaseImplTest();
        test.saveTest();
        test.deleteBookByIdTest();
        test.deleteBookTest();
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
            System.out.println("Task8.TEST - OK");
        } else {
            System.out.println("Task8.TEST FAILED");
        }
    }
}
