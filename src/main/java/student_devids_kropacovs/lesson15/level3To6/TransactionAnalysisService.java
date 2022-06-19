package student_devids_kropacovs.lesson15.level3To6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Transaction> findTransactionIn2011 (List<Transaction> transactionList){
        return transactionList.stream()
                .filter(transaction -> 2011 == transaction.getYear())
                .collect(toList());
    }

    public List<Transaction> findTransactionByYear (List<Transaction> transactionList, int year){
        return transactionList.stream()
                .filter(transaction -> year == transaction.getYear())
                .collect(toList());
    }

    public List<Transaction> sortTransactionsByValueFromLowToHigh(List<Transaction> transactionList){
        return transactionList.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }


    public List<Transaction> sortTransactionsByValueFromHighToLow(List<Transaction> transactionList){
        return transactionList.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(toList());
    }

    public List<Transaction> sortTransactionsIn2011ByValueFromLowToHigh(List<Transaction> transactionList){
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public Set<Integer> getUniqueYearWhereTransactionWereMade(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }


    public List<Integer> getAllYearWhereTransactionWereMade(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getYear)
                .collect(toList());
    }

    public Set<String> findAllTraderNames(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllTraderNamesFromCambridge(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }
    public Set<String> findAllTraderNamesFromCity(List<Transaction> transactionList, String cityName){
        return transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(cityName))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean checkIfThereIsAtLeastOneTraderInMilan(List<Transaction> transactionList){
        return transactionList.stream()
                .map(transaction -> transaction.getTrader())
                .anyMatch(trader -> trader.getCity().equals("Milan"));
    }
    public boolean checkIfThereIsAtLeastOneTraderInCity(List<Transaction> transactionList, String cityName){
        return transactionList.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityName));
    }

    public Optional<Integer> findTheBiggestTransaction(List<Transaction> transactionList){
        return transactionList.stream()
                .map(transaction -> transaction.getValue())
                .max(Integer::compareTo);
    }

    public Optional<Integer> findTheSmallestTransaction(List<Transaction> transactionList){
        return transactionList.stream()
                .map(transaction -> transaction.getValue())
                .min(Integer::compareTo);
    }

    public String findAllTradersNames (List<Transaction> transactionList){
        return transactionList.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public String findAllTradersCities (List<Transaction> transactionList){
        return transactionList.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
