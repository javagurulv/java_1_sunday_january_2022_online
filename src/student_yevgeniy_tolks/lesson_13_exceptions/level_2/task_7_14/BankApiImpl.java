package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_14;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public List<BankClient> getClients() {
        return clients;
    }

    @Override
    public Optional<BankClient> findById(UserCredentials userCredentials, String userID)
            throws AccessDeniedException {

        if (userCredentials.getRoles().contains(Role.CAN_SEARCH_CLIENT)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (userID.equals(client.getUserId())) {
                System.out.println(client);
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }
}
