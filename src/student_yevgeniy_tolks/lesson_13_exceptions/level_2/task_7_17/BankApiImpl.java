package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_17;

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

        if (userCredentials.hasRole(Role.CAN_SEARCH_CLIENT)) {
            throw new AccessDeniedException();
        }else {
            for (BankClient client : clients) {
                if (userID.equals(client.getUserId())) {
                    return Optional.of(client);
                }
            }
        }
        return Optional.empty();
    }
}
