package student_devids_kropacovs.lesson12.level2_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest bookDatabaseImplTest =new BookDatabaseImplTest();
        bookDatabaseImplTest.deleteBookByIDTrueTest();
        bookDatabaseImplTest.deleteBookByIDFalseTest();
        bookDatabaseImplTest.deleteBookByObjectTrueTest();
        bookDatabaseImplTest.deleteBookByObjectFalseTest();
        bookDatabaseImplTest.findBookByIDTrue();
        bookDatabaseImplTest.findBookByIDFalse();
        bookDatabaseImplTest.findBooksOfOneAuthorTest();
        bookDatabaseImplTest.findBooksOfOneAuthorTestNoBooks();

    }

    public void deleteBookByIDTrueTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        if(bookDatabase.delete((long)1)){
            System.out.println("Delete book by ID ture Test PASS");
        }else{
            System.out.println("Delete book by ID ture Test FAIL");
        }
    }

    public void deleteBookByIDFalseTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        if(!bookDatabase.delete((long)3)){
            System.out.println("Delete book by ID false Test PASS");
        }else{
            System.out.println("Delete book by ID false Test FAIL");
        }
    }

    public void deleteBookByObjectTrueTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        if(bookDatabase.delete(book2)){
            System.out.println("Delete book by object ture Test PASS");
        }else{
            System.out.println("Delete book by object ture Test FAIL");
        }
    }

    public void deleteBookByObjectFalseTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Book book3 = new Book("Andrue", "Java");
        if(!bookDatabase.delete(book3)){
            System.out.println("Delete book by object false Test PASS");
        }else{
            System.out.println("Delete book by object false Test FAIL");
        }
    }

    public void findBookByIDTrue(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> bookOptional= bookDatabase.findById((long)2);
        if(bookOptional.isPresent()){
            System.out.println("Find book by ID test PASS");
        }else{
            System.out.println("Find book by ID test FAIL");
        }

    }

    public void findBookByIDFalse(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> bookOptional= bookDatabase.findById((long)3);
        if(!bookOptional.isPresent()){
            System.out.println("Find book by ID test PASS");
        }else{
            System.out.println("Find book by ID test FAIL");
        }
    }

    public void findBooksOfOneAuthorTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);

        List<Book> bookListWithOneAuthor = new ArrayList<>();
        bookListWithOneAuthor.add(book2); bookListWithOneAuthor.add(book4);
        if(bookListWithOneAuthor.equals(bookDatabase.findByAuthor("Andy"))){
            System.out.println("Find book by Author test PASS");
        }else{
            System.out.println("Find book by Author test FAIL");
        }
    }

    public void findBooksOfOneAuthorTestNoBooks(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);

        if(bookDatabase.findByAuthor("Arthur").isEmpty()){
            System.out.println("No book is found by Author test PASS");
        }else{
            System.out.println("No book is found by Author test FAIL");
        }
    }

}
