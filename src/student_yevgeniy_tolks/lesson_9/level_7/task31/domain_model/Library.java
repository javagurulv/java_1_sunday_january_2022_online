package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

import java.util.ArrayList;
import java.util.List;

class Library {
    private String libraryName;
    private List<Client> clients = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addClientInTheList(Client client) {
        this.clients.add(client);
    }

    public void addBookInTheList(Book book){
        this.books.add(book);
    }

    public List<Client> getClients() {
        return this.clients;
    }

    public List<Book> getBooks() {
        return this.books;
    }
}