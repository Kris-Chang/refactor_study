package com.kris.study;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Kris on 16/5/4.
 */
public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String statement(){
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
        }
        result += "Amount owed is "+String.valueOf(getTotalAmount())+"\n";
        result += "You earned " + String.valueOf(getFrequentRentPoints())+" frequent rent points";
        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

    private int getFrequentRentPoints(){
        int points = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            points += each.getFrequentRentPoints();
        }
        return points;
    }


}
