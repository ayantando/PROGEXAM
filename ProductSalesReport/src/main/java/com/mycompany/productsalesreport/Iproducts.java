/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Iproducts {
    
    public interface Iproduct{
        int GetTotalProductsSold();
        double GetAverageProductSold();
        String GetMostPopularProduct();
        
        
      

interface IProducts {
    int getTotalSold();
    double getAverageSold();
    String getMostPopular();
}

class Product implements IProducts {
    private String[] names;   // single-dimensional array
    private int[][] sales;    // two-dimensional: [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    private int productTotal(int p) {
        int sum = 0;
        for (int m = 0; m < sales[p].length; m++) sum += sales[p][m];
        return sum;
    }

    public int getTotalSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) total += productTotal(p);
        return total;
    }

    public double getAverageSold() {
        return (double) getTotalSold() / (sales.length * sales[0].length);
    }

    public String getMostPopular() {
        int best = 0;
        for (int p = 1; p < sales.length; p++)
            if (productTotal(p) > productTotal(best)) best = p;
        return names[best] + " (" + productTotal(best) + ")";
    }
}

public class SalesReport {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];

        for (int p = 0; p < 3; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + names[p] + " mattress: ");
                sales[p][m] = in.nextInt();
            }
            System.out.println();
        }

        Product report = new Product(names, sales);
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(50));
        System.out.println("TOTAL PRODUCT SALES: " + report.getTotalSold());
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", report.getAverageSold());
        System.out.println("MOST POPULAR PRODUCT: " + report.getMostPopular());
    }
}
        
        
        
        
        
        
    }
    
}
