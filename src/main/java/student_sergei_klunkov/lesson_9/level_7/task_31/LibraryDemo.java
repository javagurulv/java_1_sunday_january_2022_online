package student_sergei_klunkov.lesson_9.level_7.task_31;

class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();
        Book firstBook = new Book("A. H. Tamsaare", "Vanad ja noored");
        Book secondBook = new Book("L. Koidula", "Kogutud luuletused");
        Reader firstReader = new Reader("Alex P.", "Paldiski mnt. 107", 56565656);
        Reader secondReader = new Reader("Lizi B.", "Osmusaare tn. 18", 54545454);

        library.addReaderInTheClientsList(firstReader);
        library.addReaderInTheClientsList(secondReader);
        library.addNewBookInStock(firstBook);
        library.addNewBookInStock(secondBook);
        System.out.println(library.getAllBooks().toString());
        System.out.println();
        System.out.println(library.getReaders().toString());

        library.clientTakesBookFromLibrary(firstBook);
        library.clientTakesBookFromLibrary(secondBook);
        library.clientReturnBookBackToLibrary(firstBook);
        library.clientReturnBookBackToLibrary(secondBook);



    }
}
