package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4.task6_26;

class TitleSearchCriteria implements SearchCriteria{
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}
