package student_yevgeniy_tolks.lesson_15_streams.level_3_4.task18_31;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService;
    TransactionTestData data;

    @Before
    public void init() {
        transactionAnalysisService = new TransactionAnalysisService();
        data = new TransactionTestData();
    }

    @Test
    public void findTransactionIn2011TestV1() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2011 = transactionAnalysisService
                .findTransactionIn2011(allTransactionList);
        int year2011 = expectedTransactionList2011.get(0).getYear();
        assertEquals(expectedTransactionList2011.size(), 2);
        assertEquals(year2011, 2011);
    }

    @Test
    public void findTransactionIn2011TestV2() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2011 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2011);
        int year2011 = expectedTransactionList2011.get(0).getYear();
        assertEquals(expectedTransactionList2011.size(), 2);
        assertEquals(year2011, 2011);
    }

    @Test
    public void findTransactionIn2012Test() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2012 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2012);
        int year2012 = expectedTransactionList2012.get(0).getYear();
        assertEquals(expectedTransactionList2012.size(), 4);
        assertEquals(year2012, 2012);
    }

    @Test
    public void findTransactionIn2013Test() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedTransactionList2013 = transactionAnalysisService
                .findTransactionByYear(allTransactionList, 2013);
        assertEquals(expectedTransactionList2013.size(), 0);
        assertEquals(expectedTransactionList2013, new ArrayList<>());
    }

    @Test
    public void sortTransactionByValueFromLowToHighTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByValueFromLowToHigh(allTransactionList);
        int lowestValue = expectedSortingResult.get(0).getValue();
        int highestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(lowestValue, 300);
        assertEquals(highestValue, 1000);
    }

    @Test
    public void sortTransactionByValueFromHighToLowTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByValueFromHighToLow(allTransactionList);
        int highestValue = expectedSortingResult.get(0).getValue();
        int lowestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(lowestValue, 300);
        assertEquals(highestValue, 1000);
    }

    @Test
    public void sortByYear2011AndByValueFromLowToHighTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Transaction> expectedSortingResult = transactionAnalysisService.sortByYear2011AndByValueFromLowToHigh(allTransactionList);
        int year2011 = expectedSortingResult.get(0).getYear();
        int lowestValue = expectedSortingResult.get(0).getValue();
        int highestValue = expectedSortingResult.get(expectedSortingResult.size() - 1).getValue();
        assertEquals(year2011, 2011);
        assertEquals(expectedSortingResult.size(), 2);
        assertEquals(highestValue, 400);
        assertEquals(lowestValue, 300);
    }

    @Test
    public void getAllTransactionYearsTest() {
        List<Transaction> allTransactionList = data.getTransactions();
        List<Integer> expectedAllTransactionYearList = transactionAnalysisService
                .getAllTransactionYears(allTransactionList);
        List<Integer> actualTransactionYearList = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expectedAllTransactionYearList, actualTransactionYearList);
    }
}