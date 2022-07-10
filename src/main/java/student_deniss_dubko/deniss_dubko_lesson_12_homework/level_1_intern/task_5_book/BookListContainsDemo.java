package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_1_intern.task_5_book;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Kathy Sierra", "Head First Java. ");
        Book book2 = new Book("Robert C. Martin", "Clean Code. ");
        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("Robert C. Martin", "Clean Code. ");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook + " - " + books);

        Book bookNotInTheList = new Book("Stanley Lippman", "C++ Primer");
        boolean notContainBook = books.contains(bookNotInTheList);
        System.out.println(notContainBook + " not represented!");
    }

}