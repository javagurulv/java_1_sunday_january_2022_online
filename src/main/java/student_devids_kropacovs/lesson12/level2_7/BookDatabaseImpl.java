package student_devids_kropacovs.lesson12.level2_7;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();
    private long idForBook;

    public BookDatabaseImpl() {
        this.idForBook = 0;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Long save(Book book) {
        this.idForBook = idForBook + 1;
        book.setId(idForBook);
        bookList.add(book);
        return idForBook;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book bookToCheck : bookList) {
            if (Objects.equals(bookToCheck.getId(), bookId)) {
                bookList.remove(bookToCheck);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookToCheck : bookList) {
            if (bookToCheck.equals(book)) {
                bookList.remove(bookToCheck);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookListOfOneAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                bookListOfOneAuthor.add(book);
            }
        }
        return bookListOfOneAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListOfBookWithSameTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                bookListOfBookWithSameTitle.add(book);
            }
        }
        return bookListOfBookWithSameTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> author.equals(book.getAuthor()));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> title.equals(book.getTitle()));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> bookListWithCriteria = new ArrayList<>();
        for (Book book : this.bookList) {
            if (searchCriteria.match(book)) {
                bookListWithCriteria.add(book);
            }
        }
        return bookListWithCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthor = new HashSet<>();
        for (Book book : bookList) {
            uniqueAuthor.add(book.getAuthor());
        }
        return uniqueAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitle = new HashSet<>();
        for (Book book : bookList) {
            uniqueTitle.add(book.getTitle());
        }
        return uniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBook = new HashSet<>();
        uniqueBook.addAll(bookList);
        return uniqueBook;
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> listMap = new HashMap<>();
        for(Book book : bookList){
            listMap.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }

        return listMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> listMap = new HashMap<>();
        for(Book book : bookList){
            listMap.put(book.getAuthor(), findByAuthor(book.getAuthor()).size());
        }

        return listMap;
    }

}
