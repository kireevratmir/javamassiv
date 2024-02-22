package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        long averageSales = averageSale(sales);
        int months = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                months++;
            }
        }
        return months;
    }

    public int monthsAboveAverage(long[] sales) {
        long averageSales = averageSale(sales);
        int months = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                months++;
            }
        }
        return months;
    }
}
