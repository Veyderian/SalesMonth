package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldTotalSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotalSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualTotalSales = service.totalSalesMonth(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void shouldAverageSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualAverageSales = service.averageSalesMonth(sales);


        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldBelowAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAverage = 5;
        long actualBelowAverage = service.SalesBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldAboveAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveAverage = 5;
        long actualAboveAverage = service.SalesAboveAverageMonth(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

}
