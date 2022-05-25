package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction{
private BookDataBase bookDataBase;

    public DeleteByIdUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
     public void execute() {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter ID to delete a book: ");
         Long bookId=scanner.nextLong();
         boolean bookDeleteByAuthor = bookDataBase.delete(bookId);
         System.out.println(bookDeleteByAuthor);
     }
 }
