package student_aleksandrs_padalko.lesson_3.level_4;

public class BookDemo {
    public static void main(String[] args)
    {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
