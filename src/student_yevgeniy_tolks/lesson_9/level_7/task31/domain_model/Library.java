package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

import java.util.ArrayList;
import java.util.List;

class Library {

    private List<Client> clients = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Book> absentBooks = new ArrayList<>();

    public void addClientInTheList(Client client) {
        this.clients.add(client);
    }

    public void addBookInTheList(Book book) {
        this.books.add(book);
    }

    public List<Client> getClients() {
        return this.clients;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<Book> getAbsentBooks() {
        return this.absentBooks;
    }

    public void takeABookFromLibrary(Book book) {
        if (book.isBookFoundInLibrary()) {
            this.absentBooks.add(book);
            this.books.remove(book);
        }
    }

    public void returnBookToLibrary(Book book){
        this.absentBooks.remove(book);
        this.books.add(book);
    }
}