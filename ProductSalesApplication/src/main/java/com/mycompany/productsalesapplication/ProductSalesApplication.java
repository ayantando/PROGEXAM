/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesapplication;

/**
 *
 * @author Student
 */
public class ProductSalesApplication {

    public static void main(String[] args) {
        
private final int SALES_LIMIT = 500;

private int[][] salesData = {
    {300, 150, 700},
    {250, 200, 600}
};

private int yearsProcessed = 0;

       
yearsProcessed = salesData.length;

int totalSales = 0;
int overLimit = 0;
int underLimit = 0;

StringBuilder data = new StringBuilder();

data.append("Product Sales Data\n\n");
data.append("Year\tMicrophone\tSpeakers\tMixing Desk\n");

for (int i = 0; i < salesData.length; i++) {
    data.append("Year ").append(i + 1);

    for (int j = 0; j < salesData[i].length; j++) {
        int sale = salesData[i][j];

        totalSales += sale;

        if (sale > SALES_LIMIT) {
            overLimit++;
        } else if (sale < SALES_LIMIT) {
            underLimit++;
        }

        data.append("\t").append(sale);
    }

    data.append("\n");
}

int numberOfSales = salesData.length * salesData[0].length;
double averageSales = (double) totalSales / numberOfSales;

productDataTextArea.setText(data.toString());

salesSummaryTextArea.setText(
    "Total Sales: " + totalSales
    + "\nAverage Sales: " + Math.round(averageSales)
    + "\nSales over limit: " + overLimit
    + "\nSales under limit: " + underLimit
);

yearsProcessedLabel.setText(
    "Years Processed: " + yearsProcessed
);
      
}
}
    

