package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

}