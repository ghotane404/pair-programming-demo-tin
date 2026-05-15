package com.pluralsight.contract;

public class SalesContract extends Contract
{
    private double totalPrice;      // field (belongs to the class)
    private double monthlyPayment;
    // this is a constructor
    // constructor will receive parameters when an object is created
    // note: parameters are temporary values
    public SalesContract(String date, String customerName, String customerEmail,
                         String vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.totalPrice = totalPrice;   // totalPrice = Laptop
        this.monthlyPayment = monthlyPayment;   // monthlyPayment = 999
    }

    @Override
    public double getTotalPrice()
    {
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment()
    {
        return monthlyPayment;
    }
}
