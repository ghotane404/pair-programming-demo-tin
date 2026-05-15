package com.pluralsight.models;

public class LeaseContract extends Contract
{
    final private static double LEASE_FEE_RATE = .07;    // Lease Fee (7% of the original price)
    final private static double EXPECTED_ENDING_VALUE = .50;   // Expected Ending Value (50% of the original price)
    final private static double LEASE_INTEREST_RATE = .04;  // All leases are financed at 4.0% for 36 months
    final private static int LEASE_MONTHS = 36;     // 36 months

    private double totalPrice;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail,
                         String vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);

        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

//    Methods will include a constructor and getters and setters for all fields except total
//    price and monthly payment.

//    You should provide overrides for getTotalPrice() and getMonthlyPayment()
//    that will return computed values based on the rules above.
    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

}