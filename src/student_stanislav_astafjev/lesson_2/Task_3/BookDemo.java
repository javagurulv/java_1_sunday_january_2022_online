package student_stanislav_astafjev.lesson_2.Task_3;

import student_stanislav_astafjev.lesson_2.Task_3.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);

    }
}

