package com.pluralsight.contract;

public abstract class SalesContract extends Contract
{
    public SalesContract(String date, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
    }

//    @Override
//    public abstract double getTotalPrice()
//    {
//        return totalPrice;
//    }
//
//    @Override
//    public abstract double getMonthlyPayment()
//    {
//        return monthlyPayment;
//    }
}
