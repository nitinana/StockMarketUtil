/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.util;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nitinanande
 */
public class StockBestPriceTest {
    
    StockBestPrice bestPrice = null;
    
    public StockBestPriceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bestPrice = new StockBestPrice();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class StockBestPrice.
     */
    @Test
    public void noSufficientData() {
       List<Double>  stockPrices = null;
       double profit = bestPrice.getMaxProfit(stockPrices);
       assertEquals(0D, profit, 0);
    }
    
    @Test
    public void firstSampleData(){
        List<Double> stockPrices = Arrays.asList(10D, 7D, 5D, 8D, 11D, 9D);
        double profit = bestPrice.getMaxProfit(stockPrices);
        assertEquals(6D, profit, 0);
    }
    
    @Test
    public void secondSampleData(){
        List<Double> stockPrices = Arrays.asList(10D, 6D, 7D, 8D, 4D, 5D);
        double profit = bestPrice.getMaxProfit(stockPrices);
        assertEquals(2D, profit, 0);
    }
    
    @Test
    public void thirdSampleData(){
        List<Double> stockPrices = Arrays.asList(10D, 6D, 7D, 8D, 1D, 5D);
        double profit = bestPrice.getMaxProfit(stockPrices);
        assertEquals(4D, profit, 0);
    }
    
    @Test
    public void fourthSampleData(){
        List<Double> stockPrices = Arrays.asList(10D, 6D, 7D, 8D, 4D,5D,9D,10d,4D);
        double profit = bestPrice.getMaxProfit(stockPrices);
        assertEquals(6D, profit, 0);
    }
    
}
