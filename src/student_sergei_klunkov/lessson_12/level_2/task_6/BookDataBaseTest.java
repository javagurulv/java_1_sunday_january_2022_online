package student_sergei_klunkov.lessson_12.level_2.task_6;

import java.util.List;

class BookDataBaseTest {

    public static void main(String[] args) {
        BookDataBaseTest test = new BookDataBaseTest();
        test.saveIdTest();
        test.deleteIdTest();
        test.deleteBookTest();

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
}
