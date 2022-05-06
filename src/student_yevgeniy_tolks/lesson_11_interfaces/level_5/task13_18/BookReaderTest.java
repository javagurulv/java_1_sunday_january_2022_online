package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;


class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.searchForNoDuplicateTest();
        test.addTest();
        test.titleAndAuthorPresenceTest();
        test.noTitleAndNoAuthorPresenceTest();
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
}
