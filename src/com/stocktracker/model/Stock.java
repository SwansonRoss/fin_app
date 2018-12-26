package com.stocktracker.model;

public class Stock implements IInvestment {
    private Float initialPrice;
    private Float currentPrice;
    private Float velocity;
    private Float alpha;
    private String symbol;
    private Market market;


    public Stock(String symbol, Market market){
        this.symbol = symbol;
        this.market = market;
        getPrice();

    }

    @Override
    public void checkPrice() {

    }

    @Override
    public float getPrice() {
        market.getInvestmentPrice(this);
        return 0;
    }

    @Override
    public float getAlpha(){
        return 0;
    }

    @Override
    public String getSymbol(){
        return this.symbol;
    }
}
