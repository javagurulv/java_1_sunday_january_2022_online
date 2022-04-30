package student_yevgeniy_tolks.lesson_9.level_7.task31;

import java.util.ArrayList;
import java.util.List;

class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library("HEAP OF KNOWLEDGE");
        Client client1 = new Client("J. Tolks", "S. Eizensteina", 26395758);
        Client client2 = new Client("A. Tolka", "S. Eizensteina", 26146341);
        Book book1 = new Book("Tolstoy","War and Peace");


        List<Client> clientList = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();

        library.addClientInTheList(clientList, client1);
        library.addClientInTheList(clientList, client2);
        library.addBookInTheList(bookList,book1);

        book1.takeABookFromLibrary(bookList,book1);

    }
}
