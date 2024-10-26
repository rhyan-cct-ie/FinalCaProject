/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalcaproject;

/**
 *
 * @author reg05
 */
import java.util.ArrayList;

public class CustomerDiscountGenerator {
    public static void main(String[] args) {
        String inCustomerFile = "C:\\Users\\reg05\\CCT\\customers.txt";
        String outCustomerFile = "C:\\Users\\reg05\\CCT\\customersdiscount.txt";

        ArrayList<Customer> customers = fileHandler.readCustomers(inCustomerFile);
        fileHandler.writeDiscountedCustomers(customers, outCustomerFile);
    }
}
