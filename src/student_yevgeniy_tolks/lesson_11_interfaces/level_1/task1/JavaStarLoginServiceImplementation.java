package student_yevgeniy_tolks.lesson_11_interfaces.level_1.task1;

class JavaStarLoginServiceImplementation implements JavaStarLoginService{

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
