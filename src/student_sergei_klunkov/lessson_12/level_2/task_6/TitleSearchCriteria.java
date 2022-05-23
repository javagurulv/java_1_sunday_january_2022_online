package student_sergei_klunkov.lessson_12.level_2.task_6;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return  book.getTitle().equals(this.titleToSearch);
    }

}
