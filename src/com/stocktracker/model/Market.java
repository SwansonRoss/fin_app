/*
*
* This object contains code to query the IEX API
*
* for more info about the IEX API, please check out the documentation: https://iextrading.com/developer/docs
*
*/

package com.stocktracker.model;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Market {


    public float getInvestmentPrice(IInvestment investment){
        // https://www.google.com/search?tbm=fin&q=[STOCK SYMBOL]
        StringBuilder symbolSearch = new StringBuilder();
        symbolSearch.append("https://ws-api.iextrading.com/1.0/stock/");// /tops?symbols=");
        symbolSearch.append(investment.getSymbol());
        symbolSearch.append("/book");

        String searchString = symbolSearch.toString();

        try{
            URL stockSearch = new URL(searchString);

            try{
                HttpsURLConnection connection = (HttpsURLConnection) stockSearch.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "text/html");

                int status = connection.getResponseCode();
                System.out.println("Response code: " + status);

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine = in.readLine()) != null){
                    content.append(inputLine);
                }
                in.close();

                connection.disconnect();

                System.out.println(content.toString());



            }catch (IOException ex){System.err.println(ex);}
        }catch (MalformedURLException e){System.err.println(e);}



        return 0;
    }
}