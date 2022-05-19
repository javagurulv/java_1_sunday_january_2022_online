package student_devids_kropacovs.lesson11.level1.task1;

class JavaStarLoginServiceImpl implements JavaStarLoginService{

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
