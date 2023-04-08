package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calcAverageSales(sale);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateMinMonthSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMonthMinSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMonthMaxSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcBelowAverageSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcAboveAverageSales(sale);
        Assertions.assertEquals(expected, actual);

    }


}


