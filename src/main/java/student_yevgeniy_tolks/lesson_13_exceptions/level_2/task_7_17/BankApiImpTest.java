package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_17;

import java.util.List;

class BankApiImpTest {
    public static void main(String[] args)  {
        BankApiImpTest test = new BankApiImpTest();
        test.throwExceptionWithoutRoleTest();
        test.shouldNotThrowExceptionRoleIsPresentTest();
    }

    public void throwExceptionWithoutRoleTest() {
        List<Role> clientRole = List.of();
        UserCredentials userCredentials = new UserCredentials(clientRole);

        BankClient client1 = new BankClient("1", "Tolks");
        BankClient client2 = new BankClient("2", "Petrov");
        BankClient client3 = new BankClient("3", "Sidorov");
        List<BankClient> clientList = List.of(client1, client2, client3);

        BankApiImpl bankApi = new BankApiImpl(clientList);
        try {
            bankApi.findById(userCredentials, "1");
            System.out.println("Task13.Exception is thrown.TEST OK");
        } catch (AccessDeniedException e) {
            System.out.println("Task13.TEST FAILED");
        }
    }

    public void shouldNotThrowExceptionRoleIsPresentTest()  {
        List<Role> clientRole = List.of(Role.CAN_SEARCH_CLIENT);
        UserCredentials userCredentials = new UserCredentials(clientRole);

        BankClient client1 = new BankClient("1", "Tolks");
        BankClient client2 = new BankClient("2", "Petrov");
        BankClient client3 = new BankClient("3", "Sidorov");
        List<BankClient> clientList = List.of(client1, client2, client3);

        BankApiImpl bankApi = new BankApiImpl(clientList);
        try {
            bankApi.findById(userCredentials, "1");
            System.out.println("Task14.TEST FAILED");
        } catch (Exception e) {
            System.out.println("Task14.Exception is not thrown.TEST OK");
        }
    }
}
