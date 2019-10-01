package snackBar;

import java.util.*;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quantity, double cost, int vendingId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    public int getVendingId() {
        return this.vendingId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity) {
        final double totalCost;
        totalCost = this.cost * quantity;
        return totalCost;
    }

    public void getDetails(Object[] vendingObjects)
    {
        String vendName = "";
        
            for (int i = 0; i < vendingObjects.length; i++) {
                if(this.vendingId == ((VendingMachine)vendingObjects[i]).getId())
                {
                    vendName = ((VendingMachine)vendingObjects[i]).getName();    
                }
            }

            String returnString = "Name : " + this.name + "\n" + 
            "Vending Machine Name: " + vendName + "\n"
            + "Quantity on hand: " + this.quantity + "\n" + 
            "Total cost of current snacks "  + (this.quantity * this.cost);
            System.out.println(returnString);
    }
}