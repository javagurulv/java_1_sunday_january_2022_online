package student_sergei_klunkov.lesson_11.level_5;


import java.util.List;

interface BookReader {

    boolean searchSameBooksInElectronicReader(Book book, List<Book> books);
    boolean addBookToElectronicReader(Book book, List<Book> books);
    boolean isAuthorAndTitlePresent(Book book, List<Book> books);
    boolean searchBook(Book book,List<Book> books);
    boolean deleteBook(Book book, List<Book> books);
    String[] provideListOfBooks(List<Book> listOfBooks);
    List<Book> searchBooksByAuthor(String author, List<Book> books);
    List<Book> searchBooksByAuthorV2(String author, String query, List<Book> books);
    List<Book> searchBooksByTitle(String title, List<Book> books);
    List<Book> searchBooksByTitleV2(String title, String query, List<Book> books);
    StatusOfTheBook giveBookStatusRead(Book book, List<Book> books);
    StatusOfTheBook giveBookStatusUnRead(Book book, List<Book> books);
    List<Book> provideListOfBooksStatusRead(List<Book> listOfBooks);
    List<Book> provideListOfBooksStatusUnRead(List <Book> listOfBooks);


}
