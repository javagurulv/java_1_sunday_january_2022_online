package student_sergei_klunkov.lesson_13.level_2;

import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        test.shouldNotThrowExceptionRoleIsPresentedTest();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {

        List<Role> clientRole = List.of();
        UserCredentials credentials = new UserCredentials(clientRole);

        BankClient client1 = new BankClient("111", "Sergei");
        BankClient client2 = new BankClient("222", "Anton");
        BankClient client3 = new BankClient("333", "Biba");
        List<BankClient> clientList = List.of(client1, client2, client3);

        BankApiImpl bankApi = new BankApiImpl(clientList);
        try {
            bankApi.findByUid(credentials, "111");
            System.out.println("TEST PASSED! Exception is thrown!");
        } catch(AccessDeniedException e) {
            System.out.println("TEST FAILED!");
        }
    }

    public void shouldNotThrowExceptionRoleIsPresentedTest() {
        List<Role> clientRole = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(clientRole);

        BankClient client1 = new BankClient("111", "Sergei");
        BankClient client2 = new BankClient("222", "Anton");
        BankClient client3 = new BankClient("333", "Biba");
        List<BankClient> clientList = List.of(client1, client2, client3);

        BankApiImpl bankApi = new BankApiImpl(clientList);
        try {
            bankApi.findByUid(userCredentials, "2");
            System.out.println("TEST FAILED!");
        } catch (Exception e) {
            System.out.println("TEST PASSED! Exception is not thrown!");
        }
    }

}
