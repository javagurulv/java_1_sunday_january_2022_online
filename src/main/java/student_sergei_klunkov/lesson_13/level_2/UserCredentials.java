package student_sergei_klunkov.lesson_13.level_2;

import java.util.List;
import java.util.Objects;

class UserCredentials {

    private List<Role> roles;

    boolean role;

    public UserCredentials(List<Role> roles){
        this.roles = roles;
    }

    public List<Role> getRoles() { return roles; }

    public boolean hasRole(Role role) { return roles.contains(role); }

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
