package student_sergei_klunkov.lessson_12.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDataBaseTest {

    public static void main(String[] args) {
        BookDataBaseTest test = new BookDataBaseTest();
        test.saveIdTest();
        test.deleteIdTest();

    }


    public void saveIdTest() {
        Book book = new Book("A1", "B1");
        Long bookId = 1L;

        BookDataBaseImpl impl = new BookDataBaseImpl();
        Long expectedBookId = impl.save(book);
        if (bookId.equals(expectedBookId)){
            System.out.println(" Save Book ID " + " - Test passed! ");
        } else {
            System.out.println(" Save Book ID " + " - Test failed! ");
        }
    }

    public void deleteIdTest() {
        Book book = new Book("A1", "B1");
        book.setId(1L);

        BookDataBaseImpl impl = new BookDataBaseImpl();
        List<Book> books = impl.getBooks();
        books.add(book);
        Long bookId = 1L;

        boolean bookToDeleteById = impl.delete(bookId);
        if (bookToDeleteById){
            System.out.println(" Delete Book ID " + " - Test passed! ");
        } else {
            System.out.println(" Delete Book ID " + " - Test failed! ");
        }
    }

}
