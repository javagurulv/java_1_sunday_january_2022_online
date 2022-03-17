package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_4_junior;

public class Book {

    private String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }


}
