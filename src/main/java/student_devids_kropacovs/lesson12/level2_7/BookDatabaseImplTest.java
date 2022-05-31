    package student_devids_kropacovs.lesson12.level2_7;

import java.util.*;

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
        bookDatabaseImplTest.findBooksWithSameTitleTest();
        bookDatabaseImplTest.findBooksWithSameTitleTestNoBooks();
        bookDatabaseImplTest.countAllBooksTest();
        bookDatabaseImplTest.deleteBookByAuthorTest();
        bookDatabaseImplTest.deleteBookByTitleTest();
        bookDatabaseImplTest.bookListWithCriteriaTest();
        bookDatabaseImplTest.findUniqueAuthorsTest();
        bookDatabaseImplTest.findUniqueTitleTest();
        bookDatabaseImplTest.findUniqueBooksTest();
        bookDatabaseImplTest.containsBookTest();
        bookDatabaseImplTest.notContainsBookTest();
        bookDatabaseImplTest.getEachAuthorBookCountTest();
        bookDatabaseImplTest.getAuthorToBooksMapTest();
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
        if(bookOptional.isEmpty()){
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

    public void findBooksWithSameTitleTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);

        List<Book> bookListWithSameTitle = new ArrayList<>();
        bookListWithSameTitle.add(book2); bookListWithSameTitle.add(book3); bookListWithSameTitle.add(book4);
        if(bookListWithSameTitle.equals(bookDatabase.findByTitle("Java"))){
            System.out.println("Find books by Title test PASS");
        }else{
            System.out.println("Find books by Title test FAIL");
        }
    }

    public void findBooksWithSameTitleTestNoBooks(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);

        if(bookDatabase.findByTitle("C++").isEmpty()){
            System.out.println("No book is found with Title test PASS");
        }else{
            System.out.println("No book is found with Title test FAIL");
        }
    }

    public void countAllBooksTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        if(bookDatabase.countAllBooks() == 4){
            System.out.println("Count all books test PASS");
        }else{
            System.out.println("Count all books test FAIL");
        }
    }

   public void deleteBookByAuthorTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        bookDatabase.deleteByAuthor("Andy");

        List<Book> bookListWithoutAuthor = new ArrayList<>();
        bookListWithoutAuthor.add(book1); bookListWithoutAuthor.add(book3);

        if(bookListWithoutAuthor.equals(bookDatabase.getBookList())){
            System.out.println("Delete books of same Author test PASS");
        }else{
            System.out.println("Delete books of same Author test FAIL");
        }
    }

   public void deleteBookByTitleTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        bookDatabase.deleteByTitle("Java");
        List<Book> bookListWithSameTitle = new ArrayList<>();
        bookListWithSameTitle.add(book1);
        if(bookListWithSameTitle.equals(bookDatabase.getBookList())){
            System.out.println("Delete books by Title test PASS");
        }else{
            System.out.println("Delete books by Title test FAIL");
        }
    }

    public void bookListWithCriteriaTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "GOT");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        List<Book> expectedBookList = new ArrayList<>();
        expectedBookList.add(book2); expectedBookList.add(book3); expectedBookList.add(book4);
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Andy");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Java");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        List<Book> resultedBookList = bookDatabase.find(searchCriteria);

        if(expectedBookList.equals(resultedBookList)){
            System.out.println("Find books that match criteria test PASS");
        }else{
            System.out.println("Find books that match criteria test FAIL");
        }
    }

    public void findUniqueAuthorsTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "GOT");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getAuthor()); expectedResult.add(book2.getAuthor()); expectedResult.add(book3.getAuthor());
        if(expectedResult.equals(uniqueAuthors)){
            System.out.println("Unique Authors test PASS");
        }else{
            System.out.println("Unique Authors test FAIL");
        }

    }

    public void findUniqueTitleTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "GOT");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        Set<String> uniqueTitle = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle()); expectedResult.add(book3.getTitle());
        if(expectedResult.equals(uniqueTitle)){
            System.out.println("Unique Title test PASS");
        }else{
            System.out.println("Unique Title test FAIL");
        }

    }

    public void findUniqueBooksTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        Set<Book> uniqueBooks = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1); expectedResult.add(book2); expectedResult.add(book3);expectedResult.add(book4);
        if(expectedResult.equals(uniqueBooks)){
            System.out.println("Unique Books test PASS");
        }else{
            System.out.println("Unique Books test FAIL");
        }

    }

    public void containsBookTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        if(bookDatabase.contains(book3)){
            System.out.println("Contain book test PASS");
        }else{
            System.out.println("Contain book test FAIL");
        }
    }

    public void notContainsBookTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        bookDatabase.delete(book3);
        if(!bookDatabase.contains(book3)){
            System.out.println("Do not Contain book test PASS");
        }else{
            System.out.println("Do not Contain book test FAIL");
        }
    }

    public void getEachAuthorBookCountTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        Map<String, Integer> expectedBookMap = new HashMap<>();
        expectedBookMap.put("John", 1); expectedBookMap.put("Andy", 2); expectedBookMap.put("Mary", 1);
        if(expectedBookMap.equals(bookDatabase.getEachAuthorBookCount())){
            System.out.println("Get each author book count test PASS");
        }else{
            System.out.println("Get each author book count test FAIL");
        }
    }

    public void getAuthorToBooksMapTest(){
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("John", "GOT");
        Book book2 = new Book("Andy", "Java");
        Book book3 = new Book("Mary", "Java");
        Book book4 = new Book("Andy", "Java2.0");
        bookDatabase.save(book1); bookDatabase.save(book2);
        bookDatabase.save(book3); bookDatabase.save(book4);
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();
        books1.add(book1); books2.add(book2);books2.add(book4); books3.add(book3);

        Map<String, List<Book>> expectedBookMap = new HashMap<>();
        expectedBookMap.put("John", books1); expectedBookMap.put("Andy", books2); expectedBookMap.put("Mary", books3);
        if(expectedBookMap.equals(bookDatabase.getAuthorToBooksMap())){
            System.out.println("getAuthorToBooksMap test PASS");
        }else{
            System.out.println("getAuthorToBooksMap test FAIL");
        }
    }
}
