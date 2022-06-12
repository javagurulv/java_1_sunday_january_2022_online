package student_sergei_klunkov.lesson_13.level_2;

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
}
