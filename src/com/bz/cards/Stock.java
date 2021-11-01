package com.bz.cards;

public class Stock {


    /*
     * Stock class is used to create the properties name numOfShare and price
     * */
    private String name;
    private long numOfShare;
    private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(long numOfShare) {
        this.numOfShare = numOfShare;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "=======================================" + "\n" +
                "Name of Stock = " + name + "\n" +
                "NumOfShare = " + numOfShare + "\n" +
                "price per stock is  = " + price


                ;
    }

}
