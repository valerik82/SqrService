package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "3,400,500",
            "0,-200,-300"
    })
    public void testCountSquaresInRange(int expected, int bottomBound, int topBound) {
        SqrService service = new SqrService();

        int actual = service.countSqr(bottomBound, topBound);
        Assertions.assertEquals(expected, actual);

    }


}
