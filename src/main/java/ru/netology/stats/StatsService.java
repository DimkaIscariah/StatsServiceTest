package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long calcAverageSales(long[] sales) {
        long months = 0;
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
            months = months + 1;
        }
        long average = sum / months;
        return average;
    }

    public int calcMonthMaxSales(long[] sales) {
        int maxMonth = 0;
        long saleMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                maxMonth = i;
                saleMax = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int calcMonthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcBelowAverageSales(long[] sales) {
        long average = calcAverageSales(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;


    }


    public int calcAboveAverageSales(long[] sales) {
        long average = calcAverageSales(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }
}








