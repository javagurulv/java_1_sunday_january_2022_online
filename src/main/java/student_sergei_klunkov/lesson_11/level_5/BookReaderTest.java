package student_sergei_klunkov.lesson_11.level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.searchSameBookInReaderTest();
        test.addBookToReaderTest();
        test.authorAndTitleAppearanceTest();
        test.noAuthorAndOrNoTitleAppearanceTest();
        test.deleteBookFromBookReaderTest();
        test.provideListOfBooksTest();
        test.provideAllBooksByAuthorTest();
        test.provideAllBooksByAuthorV2Test();
        test.provideAllBooksByTitleTest();
        test.provideAllBooksByTitleV2Test();
        test.statusOfTheBookReadTest();
        test.statusOfTheBookUnreadTest();
        test.provideAllReadBooks();
        test.provideAllUnReadBooks();

    }

    public void searchSameBookInReaderTest() {
        List <Book> books = List.of(
                new Book("A1", "B1"),
                new Book("A1", "B1")
        );
        Book book = new Book("A1", "B1");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean resultOfSearch = bookReader.searchSameBooksInElectronicReader(book, books);
        bookReader.printListOfBooks(books);
        if(resultOfSearch) {
            System.out.println(" Same Books Found " + " - Test passed! ");
        } else {
            System.out.println(" Same Books Found " + " - Test failed! ");
        }
    }

    public void addBookToReaderTest() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A1", "B2"));
        Book book1 = new Book("A1", "B1");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean resultOfAddingBook = bookReader.addBookToElectronicReader(book1, books);
        bookReader.printListOfBooks(books);
        if(resultOfAddingBook){
            System.out.println(" Adding Book " + " - Test passed! ");
        } else {
            System.out.println(" Adding Book " + " - Test failed! ");
        }
    }

    public void authorAndTitleAppearanceTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("A2", "B2");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean authorAndTitlePresent = bookReader.isAuthorAndTitlePresent(book, books);
        if (authorAndTitlePresent) {
            System.out.println(" Author and Title Present " + " - Test passed! ");
        } else {
            System.out.println(" Author and Title Present " + " - Test failed! ");
        }
    }

    public void noAuthorAndOrNoTitleAppearanceTest() {

        Book book = new Book(null, "B2");
        Book book1 = new Book("A4", null);
        Book book2 = new Book(null, null);
        List<Book> books = List.of(book, book1, book2);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean noAuthorAndTitlePresent = bookReader.isAuthorAndTitlePresent(book, books);
        if (!noAuthorAndTitlePresent) {
            System.out.println(" No Author or/and No Title Present " + " - Test passed! ");
        } else {
            System.out.println(" No Author or/and No Title Present " + " - Test failed! ");
        }
    }

    public void deleteBookFromBookReaderTest() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A1", "B1"));
        books.add(new Book("A2", "B2"));
        System.out.println(books.size());
        Book book = new Book("A2", "B2");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean isBookDeleted = bookReader.deleteBook(book, books);
        bookReader.printListOfBooks(books);
        if(isBookDeleted) {
            System.out.println(" Delete book from book reader " + " - Test passed! ");
        } else {
            System.out.println(" Delete book from book reader " + " - Test failed! ");
        }
    }

    public void provideListOfBooksTest() {
        List<Book> listOfBooks = List.of(
                new Book("A2", "B4"),
                new Book("A1", "B1"),
                new Book("A1", "B2"),
                new Book("A1", "B3"));
        String[] expectedArray = new String[]{
                "B4 [A2]",
                "B1 [A1]",
                "B2 [A1]",
                "B3 [A1]"};

        BookReaderImpl bookReader = new BookReaderImpl();
        String[] resultArray = bookReader.provideListOfBooks(listOfBooks);
        if (Arrays.equals(expectedArray, resultArray)) {
            System.out.println(" List of Books provided " + " - Test passed! ");
        } else {
            System.out.println(" List of Books provided " + " - Test failed! ");
        }
    }

    public void provideAllBooksByAuthorTest() {

        List<Book> books = List.of(
                new Book("A2", "B1"),
                new Book("A2", "B2"),
                new Book("A1", "B3"),
                new Book("A1", "B4"));

        Book book = new Book("A2", "B1");
        String bookAuthor = book.getAuthor();
        List<Book> expectedListOfAuthor = List.of(
                new Book("A2", "B1"),
                new Book("A2", "B2")
        );

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> booksByAuthor = bookReader.searchBooksByAuthor(bookAuthor, books);
        System.out.println(booksByAuthor.size());
        if(expectedListOfAuthor.equals(booksByAuthor)){
            System.out.println(" List of Books with same Author provided " + " - Test passed! ");
        } else {
            System.out.println(" List of Books with same Author provided " + " - Test failed! ");
        }
    }

    public void provideAllBooksByAuthorV2Test() {
        List<Book> books = List.of(
                new Book("Biba", "B1"),
                new Book("Biba", "B2"),
                new Book("Biba", "B3"),
                new Book("Boba", "B4"),
                new Book("Boba","B5"));

        Book book = new Book("Biba", "B1");
        String bookAuthor = book.getAuthor();
        String query = "Bib";
        List<Book> expectedListOfAuthor = List.of(
                new Book("Biba", "B1"),
                new Book("Biba", "B2"),
                new Book("Biba", "B3"));

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> booksByAuthor = bookReader.searchBooksByAuthorV2(bookAuthor, query, books);
        System.out.println(booksByAuthor.size());
        if (expectedListOfAuthor.equals(booksByAuthor)) {
            System.out.println(" List of Books with same Author provided V2 " + " - Test passed! ");
        } else {
            System.out.println(" List of Books with same Author provided V2 " + " - Test failed! ");
        }
    }

    public void provideAllBooksByTitleTest() {
        List<Book> books = List.of(
                new Book("Biba", "A1"),
                new Book("Boba","B1"));

        Book book = new Book("Biba", "A1");
        String bookTitle = book.getTitle();
        List<Book> expectedListByTitle = List.of(
                new Book("Biba", "A1"));

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> booksByTitle = bookReader.searchBooksByTitle(bookTitle, books);
        System.out.println(booksByTitle.size());
        if(expectedListByTitle.equals(booksByTitle)) {
            System.out.println(" List of Books with same Title provided " + " - Test passed! ");
        } else {
            System.out.println(" List of Books with same Title provided " + " - Test failed! ");
        }
    }

    public void provideAllBooksByTitleV2Test(){
        List<Book> books = List.of(
                new Book("Biba", "Man and Woman"),
                new Book("Boba","Grandpa and Grandma"));

        Book book = new Book("Biba", "Man and Woman");
        String bookTitle = book.getTitle();
        String query = "Man";
        List<Book> expectedListByTitle = List.of(
                new Book("Biba", "Man and Woman"));

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> booksByTitle = bookReader.searchBooksByTitleV2(bookTitle, query, books);
        System.out.println(booksByTitle.size());
        if(expectedListByTitle.equals(booksByTitle)) {
            System.out.println(" List of Books with same Title provided V2 " + " - Test passed! ");
        } else {
            System.out.println(" List of Books with same Title provided V2 " + " - Test failed! ");
        }
    }

    public void statusOfTheBookReadTest(){
        List<Book> books = List.of(
                new Book("Biba", "Man and Woman"),
                new Book("Boba","Grandpa and Grandma"));

        Book book = new Book("Biba", "Man and Woman");
        StatusOfTheBook expectedStatus = StatusOfTheBook.READ;

        BookReaderImpl bookReader = new BookReaderImpl();
        StatusOfTheBook resultStatus = bookReader.giveBookStatusRead(book, books);
        if(expectedStatus.equals(resultStatus)) {
            System.out.println(" Status of the Book " + " - READ " + " - Test passed! ");
        } else {
            System.out.println(" Status of the Book " + " - READ " + " - Test failed!");
        }
    }

    public void statusOfTheBookUnreadTest() {
        List<Book> books = List.of(
                new Book("Biba", "Man and Woman"),
                new Book("Boba","Grandpa and Grandma"));

        Book book = new Book("Biba", "Man and Woman");
        StatusOfTheBook expectedStatus = StatusOfTheBook.UNREAD;

        BookReaderImpl bookReader = new BookReaderImpl();
        StatusOfTheBook resultStatus = bookReader.giveBookStatusUnRead(book, books);
        if(expectedStatus.equals(resultStatus)) {
            System.out.println(" Status of the Book " + " - UNREAD " + " - Test passed! ");
        } else {
            System.out.println(" Status of the Book " + " - UNREAD " + " - Test failed!");
        }
    }

    public void provideAllReadBooks() {

        Book book = new Book("Biba", "Man and Woman");
        book.setStatus(StatusOfTheBook.READ);
        Book book1 = new Book("Boba", "Grandma and Grandpa");
        book1.setStatus(StatusOfTheBook.READ);
        List<Book> books = List.of(book, book1);

        List<Book> expectedReadBooksArray = List.of(
                new Book("Biba", "Man and Woman"),
                new Book("Boba", "Grandma and Grandpa"));

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> resultReadBooksArray = bookReader.provideListOfBooksStatusRead(books);
        if (expectedReadBooksArray.equals(resultReadBooksArray)) {
            System.out.println(" Read Books provide " + " Test passed! ");
        } else {
            System.out.println(" Read Books provide " + " Test failed! ");
        }
    }

    public void provideAllUnReadBooks() {

        Book book = new Book("Biba", "Man and Woman");
        book.setStatus(StatusOfTheBook.UNREAD);
        Book book1 = new Book("Boba", "Grandma and Grandpa");
        book1.setStatus(StatusOfTheBook.UNREAD);
        List<Book> books = List.of(book, book1);

        List<Book> expectedUnReadBooksArray = List.of(
                new Book("Biba", "Man and Woman"),
                new Book("Boba", "Grandma and Grandpa"));

        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> resultUnReadBooksArray = bookReader.provideListOfBooksStatusUnRead(books);
        if (expectedUnReadBooksArray.equals(resultUnReadBooksArray)) {
            System.out.println(" Unread Books provide " + " - Test passed! ");
        } else {
            System.out.println(" Unread Books provide " + " - Test failed! ");
        }
    }


}
