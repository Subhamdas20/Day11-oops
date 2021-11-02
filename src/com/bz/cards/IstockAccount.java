package com.bz.cards;

public interface IstockAccount {
    double valueOf();

    void buy(int amount, String symbol);

    void sell(int amount, String symbol);

    void save(String fileName);

    void printReport();
}
