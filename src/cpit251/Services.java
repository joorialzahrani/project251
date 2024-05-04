/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

/**
 *
 * @author HQ
 */
import java.util.ArrayList;

 public class Services {
    // Arrays to store service details
    private ArrayList<String> serviceNames;
    private ArrayList<String> descriptions;
    private ArrayList<Double> prices;

public Services(){
        serviceNames = new ArrayList<>();
        descriptions = new ArrayList<>();
        prices = new ArrayList<>();

        // Add service details
        serviceNames.add("shipment companies");
        descriptions.add("help to choose the best company to ship your products");
        prices.add(100.0);

        serviceNames.add("business consulting");
        descriptions.add("Offer the best techniques for your concerns");
        prices.add(200.0);

        serviceNames.add("technical issues");
        descriptions.add("We'll guide you to graphic designers and developers who suit the nature of your product");
        prices.add(300.0);

        serviceNames.add("Finish");
        descriptions.add("(calculate the total amount)");
        prices.add(0.0);
}
// Getter method for serviceNames
    public ArrayList<String> getServiceNames() {
        return serviceNames;
    }

    // Getter method for descriptions
    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    // Getter method for prices
    public ArrayList<Double> getPrices() {
        return prices;
    }
 public void displayCatalog() {
        System.out.println(".............................Welcome to our services catalog.............................\n");

        for (int i = 0; i < serviceNames.size() - 1; i++) {
            System.out.println((i + 1) + ". " + serviceNames.get(i) + " : " + descriptions.get(i) + " - " + prices.get(i)+ " SR");
        }

        System.out.println(serviceNames.size() + ". " + serviceNames.get(serviceNames.size() - 1) + " " + descriptions.get(serviceNames.size() - 1));
        System.out.println("Please enter the number corresponding to the service you'd like to book: ");
    }
// Method to check the type of service based on user choice and return the price
    public double checkType(int choice) {
        if (choice >= 1 && choice < serviceNames.size() ) {
            int index = choice - 1; // modify index to match array indexing
            // Display service details
            System.out.println("You have selected: " + serviceNames.get(index) + " service\n");
            return prices.get(index); // Return the price
        } else {
            return 0.0; // Invalid choice or "Finish" selected, return 0
        }
    }
}
