package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

class Client {
    private String clientName;
    private String clientAddress;
    private int clientTelephoneNumber;

    public Client(String clientName, String clientAddress, int clientTelephoneNumber) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientTelephoneNumber = clientTelephoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientTelephoneNumber=" + clientTelephoneNumber +
                '}';
    }
}
