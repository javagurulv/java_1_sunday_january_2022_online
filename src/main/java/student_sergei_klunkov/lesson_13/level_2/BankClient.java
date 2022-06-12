package student_sergei_klunkov.lesson_13.level_2;

import java.util.Objects;

class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName){
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUid() {
        return uid;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(uid, that.uid) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "userId='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
