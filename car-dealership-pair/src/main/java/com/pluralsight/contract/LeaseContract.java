package com.pluralsight.contract;

public class LeaseContract extends Contract
{
    private double totalPrice;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);

        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;

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
