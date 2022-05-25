package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Tolstoy", "War and Peace");
        Book book2 = new Book("Bulhakov", "Master and Margaritta");
        Reader reader1 = new Reader("J. Tolks", "S. Eizensteina", 26395758);
        Reader reader2 = new Reader("A. Tolka", "S. Eizensteina", 26146341);

        library.addReaderInTheList(reader1);
        library.addReaderInTheList(reader2);
        library.addNewBookInTheList(book1);
        library.addNewBookInTheList(book2);
        System.out.println(library.getAllBooks().toString());
        System.out.println();
        System.out.println(library.getReaders().toString());


        library.takeABookFromLibrary(book1);
        library.takeABookFromLibrary(book2);
        library.returnBookToLibrary(book1);
        library.takeABookFromLibrary(book1);

    }
}
