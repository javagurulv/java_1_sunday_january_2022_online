package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_17;

import java.util.List;
import java.util.Objects;

class UserCredentials {

    private List<Role> roles;
    boolean role;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
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
        return Objects.hash(roles);
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "roles=" + roles +
                '}';
    }
}
