package student_deniss_dubko.deniss_dubko_lesson_13_homework.level_2_intern.task_7_13;

import java.util.Objects;

class BankClient {

    private String userID;
    private String fullName;

    public BankClient(String userID,
                      String fullName) {
        this.userID = userID;
        this.fullName = fullName;
    }

    public String getUserID() {
        return userID;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(userID, that.userID) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, fullName);
    }

    @Override
    public String toString() {
        return "User ID: " + userID + ", Full Name: " + fullName;
    }

}