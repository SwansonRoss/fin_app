package com.stocktracker.model;

public interface IInvestment {

    void checkPrice();  //Querries API for price
    float getPrice();   //Return price
    float getAlpha();   //Return alpha
    String getSymbol(); //Return ticker symbol

}
