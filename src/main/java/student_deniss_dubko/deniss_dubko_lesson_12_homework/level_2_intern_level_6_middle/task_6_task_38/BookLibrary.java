package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new SearchByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new SearchByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new SearchByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new MapBooksByAuthor(bookDatabase));
        menuNumberToActionMap.put(9, new EachAuthorBookCount(bookDatabase));
        menuNumberToActionMap.put(10, new CountAllBooksUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter menu number: ");
            int userSelect = Integer.parseInt(sc.nextLine());
            if (userSelect == 0) {
                System.out.println("Thank you!");
                break;
            } else {
                executeUIAction(userSelect);
                return;
            }
        }
    }

    private void executeUIAction(int userSelect) {
        UIAction uiAction = menuNumberToActionMap.get(userSelect);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Wrong menu number: " + userSelect);
        }
    }

}