/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.util;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nitinanande
 */
public class StockBestPrice {

    /**
     * This method accept the list of stock prices and return the best profit
     * that can be gained.
     * @param stockPricesList  This is the list of stock prices
     * @return double The maximum profit that can be made 
     */
    public double getMaxProfit(List<Double> stockPricesList) {
        double maxProfit = 0;
        double buyPrice = 0;
        double sellPrice = 0;
        
        if(stockPricesList == null || stockPricesList.size()<2){
            return maxProfit;
        }

        for (int i = 0; i < stockPricesList.size() - 1; i++) {
            for (int j = i + 1; j < stockPricesList.size(); j++) {
                if ((stockPricesList.get(j) - stockPricesList.get(i)) > maxProfit) {
                    maxProfit = stockPricesList.get(j) - stockPricesList.get(i);
                    buyPrice = stockPricesList.get(i);
                    sellPrice = stockPricesList.get(j);
                }
            }
        }

        System.out.println("maxProfit=" + maxProfit + " buyPrice = " + buyPrice + " sellPrice = " + sellPrice);

        return maxProfit;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Double> stockPrices;
        stockPrices = Arrays.asList(10D, 7D, 5D, 8D, 11D, 9D);
        new StockBestPrice().getMaxProfit(stockPrices);
    }
}
