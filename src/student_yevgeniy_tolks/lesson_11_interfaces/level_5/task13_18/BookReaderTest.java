package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;


class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.searchForNoDuplicateTest();
        test.addTest();
    }

    public void searchForNoDuplicateTest() {
        Book book = new Book("Tolstoy", "War and Peace vol1");

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
}
