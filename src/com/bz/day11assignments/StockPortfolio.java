package com.bz.day11assignments;

import java.util.Scanner;

public class StockPortfolio {

    Stock stocks = new Stock();

    /*
     * valueOfTotalStock() is used to calculate total value of stock
     */
    private long valueOfTotalStock() {
        long totalPrice = stocks.getPrice() * stocks.getNumOfShare();
        return totalPrice;
    }

    /*
     * initializeStockDetails() is used to take details of stock input from used
     */
    private void initializeStockDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock name");
        stocks.setName(sc.next());
        System.out.println("Enter number of share");
        stocks.setNumOfShare(sc.nextInt());
        System.out.println("Enter price of per stock");
        stocks.setPrice(sc.nextInt());

    }

    /*
     * stockReport() Used to print report of the stock
     */
    public void stockReport() {
        System.out.println(stocks.toString());
        System.out.println("Total value of stock is = " + valueOfTotalStock());
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.initializeStockDetails();
        portfolio.stockReport();

    }
}
