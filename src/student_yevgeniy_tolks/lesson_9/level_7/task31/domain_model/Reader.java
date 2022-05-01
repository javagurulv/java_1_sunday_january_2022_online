package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

import java.util.List;

public class Reader {

    private String readerName;
    private String readerAddress;
    private int readerTelephoneNumber;


    public Reader(String clientName, String clientAddress, int clientTelephoneNumber) {
        this.readerName = clientName;
        this.readerAddress = clientAddress;
        this.readerTelephoneNumber = clientTelephoneNumber;

    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerName='" + readerName + '\'' +
                ", readerAddress='" + readerAddress + '\'' +
                ", readerTelephoneNumber=" + readerTelephoneNumber +
                '}';
    }
}
