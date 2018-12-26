package com.stocktracker.model;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader cin;
        String textFromCin;
        String symbol = null;
        Market googleMarket = new Market();

        System.out.println("Welcome to my Stock Tracker app\n" +
                "Let's get this bread!" +
                "\n\n" +
                "Enter stock symbol: ");

        cin = new BufferedReader(new InputStreamReader(System.in));
        try {
            symbol = cin.readLine();
        }catch (IOException e){System.err.println("Couldn't read input");}

       if(symbol != null){
          Stock newStock = new Stock(symbol, googleMarket);
       }

    }
}
