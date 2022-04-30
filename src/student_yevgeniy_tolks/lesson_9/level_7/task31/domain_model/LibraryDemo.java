package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();
        Client client1 = new Client("J. Tolks", "S. Eizensteina", 26395758);
        Client client2 = new Client("A. Tolka", "S. Eizensteina", 26146341);
        Book book1 = new Book("Tolstoy", "War and Peace");
        Book book2 = new Book("Bulhakov", "Master and Margaritta");
        System.out.println(library.getBooks().toString());

        library.addClientInTheList(client1);
        library.addClientInTheList(client2);
        library.addBookInTheList(book1);
        library.addBookInTheList(book2);
        library.takeABookFromLibrary(book1);
        System.out.println("Library book list \n" + library.getBooks().toString());

        System.out.println();
        System.out.println("Book taken \n" + library.getAbsentBooks().toString());
        library.returnBookToLibrary(book1);
        System.out.println(library.getAbsentBooks().toString());
        System.out.println("Library book list \n" + library.getBooks().toString());

    }
}
