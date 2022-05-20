package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_14;

import java.util.Objects;

class BankClient {

    private String userId;
    private String fullName;

    public BankClient(String userId, String fullName) {
        this.userId = userId;
        this.fullName = fullName;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(userId, that.userId) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, fullName);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
