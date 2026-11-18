/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ProductSalesReport {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Single-dimensional array (product names)
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

        // Two-dimensional array: [product][month]
        int[][] sales ={
            {25,18,20},  // cozy nights monarch
            {15,18,12},  // restonic barbardos
            {18,15,20}}; // sealy phuket
       
    
    
 
       int[] productTotals = new int[3];

        // Input
        for (int p = 0; p < products.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + products[p] + " mattress: ");
                sales[p][m] = in.nextInt();
                productTotals[p] += sales[p][m];
            }
            System.out.println();
        }

        // Calculations
        int total = 0;
        int best = 0;
        for (int p = 0; p < products.length; p++) {
            total += productTotals[p];
            if (productTotals[p] > productTotals[best]) best = p;
        }
        double average = (double) total / (products.length * 3);

        // Report
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
        System.out.println("TOTAL PRODUCT SALES:153" + total);
        System.out.printf("AVERAGE PRODUCT SALES: 17", average);
        System.out.println("MOST POPULAR PRODUCT:Cozy Nights Monarch " + products[best]
                + " (" + productTotals[best] + ")");
    }
}
        
        
        
        
        
        
        
        
    

