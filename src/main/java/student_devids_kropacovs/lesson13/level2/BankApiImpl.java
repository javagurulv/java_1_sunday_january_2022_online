package student_devids_kropacovs.lesson13.level2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {

        if(!credentials.containRole(Role.CAN_SEARCH_CLIENTS)){
            throw new AccessDeniedException();
        }else{
            for(BankClient bankClient : clients){
                if(uid.equals(bankClient.getUid())){
                    return Optional.of(bankClient);
                }
            }
        }
        return Optional.empty();
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
    }

}

