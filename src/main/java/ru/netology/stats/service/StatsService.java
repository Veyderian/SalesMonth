package ru.netology.stats.service;

public class StatsService {

    public long totalSalesMonth(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageSalesMonth(long[] sales) {
        if (sales.length > 0) {

            // long totalSales = totalSalesMonth(sales);
            // return totalSales /12;

            return totalSalesMonth(sales) / sales.length;
        }
        return 0;
    }

    public long maxSales(long[] sales) {
        long maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long minSales(long[] sales) {
        long minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long SalesBelowAverage(long[] sales) {
        long counter = 0;
        long averageSales = averageSalesMonth(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public long SalesAboveAverageMonth(long[] sales) {
        long counter = 0;
        long averageSales = averageSalesMonth(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}

