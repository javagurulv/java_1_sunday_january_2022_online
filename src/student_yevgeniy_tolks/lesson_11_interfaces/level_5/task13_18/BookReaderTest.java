package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;

import java.util.Arrays;
import java.util.List;

class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.searchForNoDuplicateTest();
        test.addTest();
        test.titleAndAuthorPresenceTest();
        test.noTitleAndNoAuthorPresenceTest();
        test.deleteBookTest();
        test.printListOfBooksToConsoleTest();
        test.printListOfBooksToConsoleTest();
    }

    public void searchForNoDuplicateTest() {
        Book book = new Book("Tolstoy", "War and Peace");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean resultOfSearch = bookReader.searchForDuplicate(book);
        bookReader.printListOfBooks();
        if (!resultOfSearch) {
            System.out.println("Duplicate not found - TEST OK");
        } else {
            System.out.println("Duplicate found - TEST FAILED");
        }
    }

    public void addTest() {

        Book book = new Book("Tolstoy", "War and Peace vol3");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean resultBookAdded = bookReader.add(book);
        bookReader.printListOfBooks();
        if (resultBookAdded) {
            System.out.println("Book is added - TEST OK");
        } else {
            System.out.println("Book is not added - TEST FAILED");
        }
    }

    public void titleAndAuthorPresenceTest() {
        Book book = new Book("Bulhakov", "Master and Margaritta");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean titleAndAuthorPresent = bookReader.isAuthorAndTitlePresent(book);
        if (titleAndAuthorPresent) {
            System.out.println("Author and title of the book present - TEST OK");
        } else {
            System.out.println("Check presence of author and title - TEST FAILED");
        }
    }

    public void noTitleAndNoAuthorPresenceTest() {
        Book book = new Book(null, "Master and Margaritta");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean noTitleAndOrAuthorPresent = bookReader.isAuthorAndTitlePresent(book);
        if (!noTitleAndOrAuthorPresent) {
            System.out.println("Check presence of author and title - TEST OK");
        } else {
            System.out.println("Author and title of the book present - TEST FAILED");
        }
    }

    public void deleteBookTest() {

        Book book = new Book("Bulhakov", "Master and Margaritta");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean isBookDeleted = bookReader.deleteBook(book);
        bookReader.printListOfBooks();
        if (isBookDeleted) {
            System.out.println("Book deleted - TEST OK");
        } else {
            System.out.println("Book is not deleted - TEST FAILED");
        }
    }

    public void printListOfBooksToConsoleTest() {
        List<Book> listOfBooks = List.of(
                new Book("Bulhakov", "Master and Margaritta"),
                new Book("Tolstoy", "War and Peace vol1"),
                new Book("Tolstoy", "War and Peace vol2"),
                new Book("Tolstoy", "War and Peace vol3")
        );

        String[] expectedArray = new String[]{
                "Master and Margaritta [Bulhakov]",
                "War and Peace vol1 [Tolstoy]",
                "War and Peace vol2 [Tolstoy]",
                "War and Peace vol3 [Tolstoy]"};

        BookReaderImplementation bookReaderImplementation = new BookReaderImplementation();
        String[] resultArray = bookReaderImplementation.provideListOfBooksToUser(listOfBooks);

        if (Arrays.equals(expectedArray, resultArray)) {
            System.out.println("List is provided - TEST OK");
        } else {
            System.out.println("Something went wrong - TEST FAILED");
        }
    }
}
