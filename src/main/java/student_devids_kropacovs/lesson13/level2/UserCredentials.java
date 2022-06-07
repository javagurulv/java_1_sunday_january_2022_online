package student_devids_kropacovs.lesson13.level2;

import java.util.List;
import java.util.Objects;

class UserCredentials {

    private List<Role> roles;
    boolean role;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean containRole(Role role){
        return roles.contains(role);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCredentials that = (UserCredentials) o;
        return Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles, role);
    }

    // создайте конструктор класса, в котором вы получаете список ролей

}
