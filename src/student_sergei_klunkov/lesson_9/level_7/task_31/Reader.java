package student_sergei_klunkov.lesson_9.level_7.task_31;

class Reader {

    private String readersName;
    private String readersAddress;
    private int readersPhoneNumber;

    public Reader(String clientsName, String clientsAddress, int clientsPhoneNumber) {

        this.readersAddress = clientsAddress ;
        this.readersName = clientsName;
        this.readersPhoneNumber = clientsPhoneNumber;

    }

    public String toString() {
        return  "Reader{" +
                "readersName=" + readersName + '\'' +
                ", readersAddress='" + readersAddress + '\'' +
                ", readersPhoneNumber=" + readersPhoneNumber +
                '}';

    }

}
