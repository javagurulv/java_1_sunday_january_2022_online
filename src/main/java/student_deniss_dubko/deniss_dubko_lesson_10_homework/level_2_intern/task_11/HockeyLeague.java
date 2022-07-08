package student_deniss_dubko.deniss_dubko_lesson_10_homework.level_2_intern.task_11;

class HockeyLeague {

    private String nameOfTheLeague;
    private int numberOfTeams;

    protected HockeyLeague(String nameOfTheLeague,
                           int numberOfTeams) {

        this.nameOfTheLeague = nameOfTheLeague;
        this.numberOfTeams = numberOfTeams;
    }

    @Override
    public String toString() {
        return "League: " + nameOfTheLeague + ", Teams: " + numberOfTeams;
    }

}