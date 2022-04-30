package student_yevgeniy_tolks.lesson_9.level_7.task31;

import java.util.List;

class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addClientInTheList(List<Client> clientList, Client client) {
        clientList.add(client);
    }

    public void addBookInTheList(List<Book> bookList, Book book){
        bookList.add(book);
    }
}