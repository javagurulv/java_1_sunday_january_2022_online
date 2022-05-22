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
}
