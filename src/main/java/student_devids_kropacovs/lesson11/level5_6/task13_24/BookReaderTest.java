package student_devids_kropacovs.lesson11.level5_6.task13_24;

import java.util.ArrayList;
import java.util.List;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.bookIsNotAdded();
        bookReaderTest.bookSuccessfullyAdded();
        bookReaderTest.oneBookIsFoundTest();
        bookReaderTest.multipleBooksIsFoundTest();
        bookReaderTest.oneBookIsFoundTestWithPartOfTheName();
        bookReaderTest.multipleBooksIsFoundTestWithPartOfThrName();
        bookReaderTest.multipleBooksIsFoundByTitle();
        bookReaderTest.multipleBooksIsFoundTestWithPartOfTheTitle();
        bookReaderTest.oneBookIsFoundByTitle();
        bookReaderTest.oneBookIsFoundTestWithPartOfTheTitle();
        bookReaderTest.markBookAsRead();
        bookReaderTest.markBooksAsRead();
    }

    public void bookSuccessfullyAdded(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("Tail", "Arthur");
        BookReader bookReader = new BookReaderImpl();
        if(bookReader.addBookToLibrary(book1) && bookReader.addBookToLibrary(book2)){
            System.out.println("All Books are added to the library (TEST PASSED)");
        }else{
            System.out.println("Book added to the library test failed ");
        }
    }

    public void bookIsNotAdded(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("Tail","Jho");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        if(!bookReader.addBookToLibrary(book2)){
            System.out.println("Book 2 is not added (TEST PASSED)");
        }else{
            System.out.println("The same book is added (TEST FAIL) ");
        }
    }

    public void oneBookIsFoundTest(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        List<Book> booksWithOneAuthor = bookReader.findBookByAuthor("Aj");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        if(booksWithOneAuthor.equals(expectedResult)){
            System.out.println("FInd book with same author (1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same author (1 Book) TEST FAIL");
        }
    }

    public void multipleBooksIsFoundTest(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        Book book3 = new Book("Test","Arthur");
        Book book4 = new Book("Amigo","Aj");
        Book book5 = new Book("Nothing","Aj");
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBookToLibrary(book1);bookReader.addBookToLibrary(book2);bookReader.addBookToLibrary(book3);
        bookReader.addBookToLibrary(book4);bookReader.addBookToLibrary(book5);
        List<Book> booksWithOneAuthor = bookReader.findBookByAuthor("Aj");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2); expectedResult.add(book4); expectedResult.add(book5);
        if(booksWithOneAuthor.equals(expectedResult)){
            System.out.println("FInd book with same author (more than 1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same author (more than 1 Book) TEST FAIL");
        }
    }

    public void oneBookIsFoundTestWithPartOfTheName(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        List<Book> booksWithOneAuthor = bookReader.findBookByPartOfTheAuthorName("A");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        if(booksWithOneAuthor.equals(expectedResult)){
            System.out.println("FInd book with same author (1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same author (1 Book) TEST FAIL");
        }
    }

    public void multipleBooksIsFoundTestWithPartOfThrName(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        Book book3 = new Book("Test","Arthur");
        Book book4 = new Book("Amigo","Aj");
        Book book5 = new Book("Nothing","Aj");
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBookToLibrary(book1);bookReader.addBookToLibrary(book2);bookReader.addBookToLibrary(book3);
        bookReader.addBookToLibrary(book4);bookReader.addBookToLibrary(book5);
        List<Book> booksWithOneAuthor = bookReader.findBookByPartOfTheAuthorName("A");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);expectedResult.add(book3); expectedResult.add(book4); expectedResult.add(book5);
        if(booksWithOneAuthor.equals(expectedResult)){
            System.out.println("FInd book with same author (more than 1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same author (more than 1 Book) TEST FAIL");
        }
    }

    public void oneBookIsFoundByTitle(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        List<Book> booksWithOneSameTitle = bookReader.findBookByBookName("abc");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        if(booksWithOneSameTitle.equals(expectedResult)){
            System.out.println("FInd book with same Title (1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same Title (1 Book) TEST FAIL");
        }
    }

    public void multipleBooksIsFoundByTitle(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        Book book3 = new Book("Test","Arthur");
        Book book4 = new Book("Amigo","Aj");
        Book book5 = new Book("Test","Aj");
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBookToLibrary(book1);bookReader.addBookToLibrary(book2);bookReader.addBookToLibrary(book3);
        bookReader.addBookToLibrary(book4);bookReader.addBookToLibrary(book5);
        List<Book> booksWithSameTitle = bookReader.findBookByBookName("Test");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3); expectedResult.add(book5);
        if(booksWithSameTitle.equals(expectedResult)){
            System.out.println("FInd book with same Title (more than 1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same Title (more than 1 Book) TEST FAIL");
        }
    }

    public void oneBookIsFoundTestWithPartOfTheTitle(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        List<Book> booksWithSameTitle = bookReader.findBookByPartOfBookName("T");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        if(booksWithSameTitle.equals(expectedResult)){
            System.out.println("FInd book with same Title (1 Book) TEST PASS");
        }else{
            System.out.println("FInd book with same Title (1 Book) TEST FAIL");
        }
    }

    public void multipleBooksIsFoundTestWithPartOfTheTitle() {
        Book book1 = new Book("Tequila", "Jho");
        Book book2 = new Book("abc", "Aj");
        Book book3 = new Book("Test", "Arthur");
        Book book4 = new Book("Amigo", "Aj");
        Book book5 = new Book("Tero", "Aj");
        BookReader bookReader = new BookReaderImpl();

        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        bookReader.addBookToLibrary(book3);
        bookReader.addBookToLibrary(book4);
        bookReader.addBookToLibrary(book5);
        List<Book> booksWithSameTitle = bookReader.findBookByPartOfBookName("Te");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        expectedResult.add(book5);
        if (booksWithSameTitle.equals(expectedResult)) {
            System.out.println("FInd book with same Title (more than 1 Book) TEST PASS");
        } else {
            System.out.println("FInd book with same Title (more than 1 Book) TEST FAIL");
        }
    }

    public void markBookAsRead(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        book1.markBookAsRead();
        if(book1.isStatus()){
            System.out.println("Mark book as read test PASS");
        }else{
            System.out.println("Mark book as read test FAIL");
        }
    }

    public void markBooksAsRead(){
        Book book1 = new Book("Tail","Jho");
        Book book2 = new Book("abc","Aj");
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        book1.markBookAsRead();
        book2.markBookAsRead();
        if(book1.isStatus() && book2.isStatus()){
            System.out.println("Mark book as read test PASS");
        }else{
            System.out.println("Mark book as read test FAIL");
        }
    }
}
