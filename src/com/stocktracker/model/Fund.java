package com.stocktracker.model;

public class Fund implements IInvestment {
    private Float initialPrice;
    private Float currentPrice;
    private Float alpha;
    private String symbol;
    private Market market;


    public Fund(String symbol, Market market){
        this.symbol = symbol;
        this.market = market;
    }

    @Override
    public void checkPrice() {

    }

    @Override
    public float getPrice() {
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
