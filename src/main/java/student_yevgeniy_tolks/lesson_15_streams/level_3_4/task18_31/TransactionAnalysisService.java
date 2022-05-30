package student_yevgeniy_tolks.lesson_15_streams.level_3_4.task18_31;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findTransactionIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionByYear(List<Transaction> transactions, int yearOfTransaction) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == yearOfTransaction)
                .collect(Collectors.toList());

    }

    public List<Transaction> sortByValueFromLowToHigh(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortByValueFromHighToLow(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> sortByYear2011AndByValueFromLowToHigh(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> getAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List<Integer> getUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getUniqueTransactionTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getUniqueTransactionTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getTraderNamesFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getTraderNamesFromDifferentCities(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(city))
                .map(trader -> trader.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean findAtLeastOneTraderFromMilan(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .anyMatch(trader -> trader.getCity().equals("Milan"));
    }

    public boolean findAtLeastOneTraderFromChosenCity(List<Transaction> transactions, String traderCity) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .anyMatch(trader -> trader.getCity().equals(traderCity));
    }

    public Optional<Integer> findMaxTransactionValue(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .max(Integer::compareTo);
    }
}
