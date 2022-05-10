package student_yevgeniy_tolks.lesson_11_interfaces.level_5_6.task13_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.searchForDuplicateTest();
        test.addTest();
        test.titleAndAuthorPresenceTest();
        test.noTitleAndOrNoAuthorPresenceTest();
        test.deleteBookTest();
        test.provideListOfBooksTest();
        test.provideAllBooksByAuthorTest();
        test.provideAllBooksByAuthorV2Test();
        test.provideAllBooksByTitleTest();
    }

    public void searchForDuplicateTest() {
        List<Book> books = List.of(
                new Book("Tolstoy", "War and Peace Vol1"),
                new Book("Tolstoy", "War and Peace Vol2")
        );
        Book book = new Book("Tolstoy", "War and Peace Vol1");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean resultOfSearch = bookReader.searchForDuplicate(book, books);
        bookReader.printListOfBooks(books);
        if (resultOfSearch) {
            System.out.println("Duplicate found - TEST OK");
        } else {
            System.out.println("Duplicate is not found - TEST FAILED");
        }
    }

    public void addTest() {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Tolstoy", "War and Peace vol3"));
        Book book1 = new Book("Tolstoy", "War and Peace vol1");


        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean resultBookAdded = bookReader.add(book1, books);
        bookReader.printListOfBooks(books);
        if (resultBookAdded) {
            System.out.println("Book is added - TEST OK");
        } else {
            System.out.println("Book is not added - TEST FAILED");
        }
    }

    public void titleAndAuthorPresenceTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Bulhakov", "Master and Margaritta");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean titleAndAuthorPresent = bookReader.isAuthorAndTitlePresent(book, books);
        if (titleAndAuthorPresent) {
            System.out.println("Author and title of the book present - TEST OK");
        } else {
            System.out.println("Check presence of author and title - TEST FAILED");
        }
    }

    public void noTitleAndOrNoAuthorPresenceTest() {

        Book book = new Book(null, "Master and Margaritta");
        Book book1 = new Book("Bulhakov", null);
        Book book2 = new Book(null, null);
        List<Book> books = List.of(book, book1, book2);

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean noTitleAndOrAuthorPresent = bookReader.isAuthorAndTitlePresent(book, books);
        if (!noTitleAndOrAuthorPresent) {
            System.out.println("Check presence of author and title - TEST OK");
        } else {
            System.out.println("Author and title of the book present - TEST FAILED");
        }
    }

    public void deleteBookTest() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bulhakov", "Master and Margaritta"));
        books.add(new Book("Tolstoy", "War and Peace vol1"));
        System.out.println(books.size());

        Book book = new Book("Tolstoy", "War and Peace vol1");

        BookReaderImplementation bookReader = new BookReaderImplementation();
        boolean isBookDeleted = bookReader.deleteBook(book, books);
        bookReader.printListOfBooks(books);
        if (isBookDeleted) {
            System.out.println("Book deleted - TEST OK");
        } else {
            System.out.println("Book is not deleted - TEST FAILED");
        }
    }

    public void provideListOfBooksTest() {
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
        String[] resultArray = bookReaderImplementation.provideListOfBooks(listOfBooks);
        if (Arrays.equals(expectedArray, resultArray)) {
            System.out.println("List is provided - TEST OK");
        } else {
            System.out.println("Something went wrong - TEST FAILED");
        }

    }

    public void provideAllBooksByAuthorTest() {

        List<Book> books = List.of(
                new Book("Bulhakov", "Master and Margaritta Vol1"),
                new Book("Bulhakov", "Master and Margaritta Vol2"),
                new Book("Tolstoy", "War and Peace vol1"),
                new Book("Tolstoy", "War and Peace vol2")
        );

        Book book = new Book("Bulhakov", "Master and Margaritta Vol1");
        String bookAuthor = book.getAuthor();
        List<Book> expectedList = List.of(
                new Book("Bulhakov", "Master and Margaritta Vol1"),
                new Book("Bulhakov", "Master and Margaritta Vol2")
        );

        BookReaderImplementation bookReaderImplementation = new BookReaderImplementation();
        List<Book> booksByAuthor = bookReaderImplementation.searchBooksByAuthor(bookAuthor, books);
        System.out.println(booksByAuthor.size());
        if (expectedList.equals(booksByAuthor)) {
            System.out.println("Books by same author found - TEST OK");
        } else {
            System.out.println("Books not found - TEST FAILED");
        }
    }

    public void provideAllBooksByAuthorV2Test() {

        List<Book> books = List.of(
                new Book("Bulhakov", "Master and Margaritta Vol1"),
                new Book("Bulhakov", "Master and Margaritta Vol2"),
                new Book("Tolstoy", "War and Peace vol1"),
                new Book("Tolstoy", "War and Peace vol2"),
                new Book("Tolstoy", "War and Peace vol3")
        );

        Book book = new Book("Tolstoy", "War and Peace vol1");
        String bookAuthor = book.getAuthor();
        String query = "Tols";
        List<Book> expectedList = List.of(
                new Book("Tolstoy", "War and Peace vol1"),
                new Book("Tolstoy", "War and Peace vol2"),
                new Book("Tolstoy", "War and Peace vol3")
        );

        BookReaderImplementation bookReaderImplementation = new BookReaderImplementation();
        List<Book> booksByAuthor = bookReaderImplementation.searchBooksByAuthorV2(bookAuthor, query, books);
        System.out.println(booksByAuthor.size());
        if (expectedList.equals(booksByAuthor)) {
            System.out.println("Books by same author found - TEST OK");
        } else {
            System.out.println("Books not found - TEST FAILED");
        }
    }

    public void provideAllBooksByTitleTest() {

        List<Book> books = List.of(
                new Book("Bulhakov", "Master and Margaritta Vol1"),
                new Book("Tolstoy", "War and Peace vol2")
        );
        Book book = new Book("Bulhakov", "Master and Margaritta Vol1");
        String bookTitle = book.getTitle();
        List<Book> expectedList = List.of(
                new Book("Bulhakov", "Master and Margaritta Vol1")
        );

        BookReaderImplementation bookReaderImplementation = new BookReaderImplementation();
        List<Book> booksByAuthor = bookReaderImplementation.searchBooksByTitle(bookTitle, books);
        System.out.println(booksByAuthor.size());
        if (expectedList.equals(booksByAuthor)) {
            System.out.println("Books by same title found - TEST OK");
        } else {
            System.out.println("Books not found - TEST FAILED");
        }
    }

}