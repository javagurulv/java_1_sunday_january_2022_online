package student_stanislav_astafjev.lesson_11.lesson.Task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javaguru")
                && (password != null)
                && password.equals("pass");
    }
}
