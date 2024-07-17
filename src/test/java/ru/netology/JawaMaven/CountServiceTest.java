package ru.netology.JawaMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //         "2,100_000,60_000,150_000"
    //  })
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void example(int expected, int income, int expenses, int threshold) {
        CountService service = new CountService();

        // int expected = 2;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
