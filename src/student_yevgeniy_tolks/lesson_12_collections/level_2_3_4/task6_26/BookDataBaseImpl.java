package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4.task6_26;

import java.util.*;
import java.util.stream.Collectors;


class BookDataBaseImpl implements BookDataBase {

    private List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        boolean deleteBookById = false;
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                books.remove(book);
                deleteBookById = true;
                break;
            }
        }
        return deleteBookById;
    }

    @Override
    public boolean delete(Book book) {
        boolean deleteBook = false;
        for (Book bookList : books) {
            if (book.equals(bookList)) {
                books.remove(book);
                deleteBook = true;
                break;
            }
        }
        return deleteBook;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> bookList = Optional.empty();
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                bookList = Optional.of(book);
            }
        }
        return bookList;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findBookByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                findBookByAuthor.add(book);
            }
        }
        return findBookByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> findBookByTitle = new ArrayList<>();
        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                findBookByTitle.add(book);
            }
        }
        return findBookByTitle;
    }

    @Override
    public int countAllBooks() {
        int bookCounter = 0;
        for (Book book : books) {
            if (book != null) {
                bookCounter++;
            }
        }
        return bookCounter;
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> author.equals(book.getAuthor()));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> title.equals(book.getTitle()));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> findBooksByCriteria = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                findBooksByCriteria.add(book);
            }
        }
        return findBooksByCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthor = new HashSet<>();
        for (Book bookByAuthor : books) {
            uniqueAuthor.add(bookByAuthor.getAuthor());
        }
        return uniqueAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitle = new HashSet<>();
        for (Book bookByTitle : books) {
            uniqueTitle.add(bookByTitle.getTitle());
        }
        return uniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return books;
    }


    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> booksByAuthor = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            booksByAuthor.put(book.getAuthor(), findByAuthor(author));
        }
        System.out.println(booksByAuthor);
        return booksByAuthor;
    }

    public int countAllBooksByAuthor(String author) {
        int bookCounter = 0;
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                bookCounter++;
            }
        }
        return bookCounter;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> countBooksByAuthor = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            countBooksByAuthor.put(author, countAllBooksByAuthor(author));
        }
        System.out.println(countBooksByAuthor);
        return countBooksByAuthor;
    }
}


