package com.bz.cards;

public class StockAccount implements IstockAccount{
    int buyAmount ,sellAmount ;
    String buySymbol , sellSymbol;



    public double valueOf(){

        return 0.0;
    };
    public void buy(int amount , String symbol){
        buyAmount = amount;
        buySymbol = symbol ;

    };
    public void sell (int amount , String symbol){
        sellAmount = amount;
        sellSymbol = symbol;

    };
    public void save (String fileName){};
    public void printReport(){

    };
}
