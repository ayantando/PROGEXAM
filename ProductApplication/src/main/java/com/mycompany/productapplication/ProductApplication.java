/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productapplication;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author Student
 */
public class ProductApplication {

    public static void main(String[] args) {}
                                       

    try {
        // Get customer details
        String customerName = txtCustomerName.getText();
        String productName = cmbProduct.getSelectedItem().toString();
        double price = Double.parseDouble(txtPrice.getText());

        // Validate input
        if (customerName.trim().isEmpty() || price <= 0) {
            JOptionPane.showMessageDialog(this,
                "Please enter valid customer details and price.");
            return;
        }

        // Calculate VAT, commission and total
        double vat = price * 0.15;
        double commission = price * 0.05;
        double total = price + vat + commission;

        // Display results
        JOptionPane.showMessageDialog(this,
            "Customer Name: " + customerName +
            "\nProduct: " + productName +
            "\nVAT: R " + vat +
            "\nCOMMISSION: R " + commission +
            "\nTOTAL: R " + total);

        // Save information to data.txt
        try {
            FileWriter writer = new FileWriter("data.txt", true);

            writer.write("DATA LOG\n");
            writer.write("************************************\n");
            writer.write("Customer Name: " + customerName + "\n");
            writer.write("Product: " + productName + "\n");
            writer.write("VAT: R " + vat + "\n");
            writer.write("COMMISSION: R " + commission + "\n");
            writer.write("TOTAL: R " + total + "\n");
            writer.write("************************************\n");

            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                "Error saving data to file.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
            "Please enter a valid product price.");
    }
}

    
    

        

