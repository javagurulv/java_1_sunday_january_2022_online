package student_devids_kropacovs.lesson15.level3To6;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void findTransactionsIn2011Test(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(2, transactionAnalysisService.findTransactionIn2011(transactions).size());
    }
    @Test
    public void findTransactionsByYear2011Test(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(2, transactionAnalysisService.findTransactionByYear(transactions, 2011).size());
    }
    @Test
    public void findTransactionsByYear2012Test(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(4, transactionAnalysisService.findTransactionByYear(transactions, 2012).size());
    }

    @Test
    public void sortListOfTransactionsFromLowToHighTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(transactions.get(2), transactionAnalysisService.sortTransactionsByValueFromLowToHigh(transactions).get(1));
    }

    @Test
    public void sortListOfTransactionsFromHighToLowTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(transactions.get(1), transactionAnalysisService.sortTransactionsByValueFromHighToLow(transactions).get(0));
    }

    @Test
    public void sortListOfTransactionsIn2011FromLowToHighTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(transactions.get(2), transactionAnalysisService.sortTransactionsIn2011ByValueFromLowToHigh(transactions).get(1));
    }

    @Test
    public void getAllYearsWhereTransactionWereMadeTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(2, transactionAnalysisService.getUniqueYearWhereTransactionWereMade(transactions).size());
    }

    @Test
    public void findAllTradersNameTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(4, transactionAnalysisService.findAllTraderNames(transactions).size());
    }

    @Test
    public void findAllTradersNameFromCambridgeTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(3, transactionAnalysisService.findAllTraderNamesFromCambridge(transactions).size());
    }


    @Test
    public void findAllTradersNameFromCambridgeUniversalMethodTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(3, transactionAnalysisService.findAllTraderNamesFromCity(transactions, "Cambridge").size());
    }


    @Test
    public void findAllTradersNameFromMilanUniversalMethodTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(1, transactionAnalysisService.findAllTraderNamesFromCity(transactions, "Milan").size());
    }

    @Test
    public void checkIfThereIsAtLeastOneTraderInMilanTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(true, transactionAnalysisService.checkIfThereIsAtLeastOneTraderInMilan(transactions));
    }

    @Test
    public void checkIfThereIsAtLeastOneTraderInCityTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(true, transactionAnalysisService.checkIfThereIsAtLeastOneTraderInCity(transactions,"Milan"));
    }

    @Test
    public void checkIfThereIsAtLeastOneTraderInCityFalseTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        assertEquals(false, transactionAnalysisService.checkIfThereIsAtLeastOneTraderInCity(transactions,"Riga"));
    }

    @Test
    public void findBiggesTransactionTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> expectedResult = Optional.of(1000);
        assertEquals(expectedResult, transactionAnalysisService.findTheBiggestTransaction(transactions));
    }

    @Test
    public void findSmallestTransactionTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> expectedResult = Optional.of(300);
        assertEquals(expectedResult, transactionAnalysisService.findTheSmallestTransaction(transactions));
    }

    @Test
    public void findAllTradersNamesTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        String expectedResult = "Alan, Brian, Mario, Raoul";
        String actualResult = transactionAnalysisService.findAllTradersNames(transactions);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findAllTradersCitiesTest(){
        TransactionTestData transactionTestData = new TransactionTestData();
        List<Transaction> transactions = transactionTestData.getTransactions();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        String expectedResult = "Cambridge, Milan";
        String actualResult = transactionAnalysisService.findAllTradersCities(transactions);
        assertEquals(expectedResult, actualResult);
    }
}