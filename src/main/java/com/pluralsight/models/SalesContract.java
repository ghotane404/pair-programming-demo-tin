package com.pluralsight.models;

public abstract class SalesContract extends Contract
{
    final private static double SALES_TAX_AMOUNT = .05;     // Sales Tax Amount (5%)
    final private static double RECORDING_FEE = 100;    // Recording Fee ($100)
    final private static double PROCESSING_FEE_UNDER_10000 = 295;   // Processing fee ($295 for vehicles under $10,000)
    final private static double PROCESSING_FEE_OVER_10000 = 495;    // Processing fee ($495 for all others)

    final private static boolean FINANCE_OPTION = true;    // Whether they want to finance (yes/no)
    final private static double LOAN_RATE_OVER_10000 = .0425;   // All loans are at 4.25% for 48 months if the price is $10,000 or more
    final private static int LOAN_MONTH_OVER_10000 = 48;
    final private static double LOAN_RATE_UNDER_10000 = .0525;      // Otherwise they are at 5.25% for 24 month
    final private static int LOAN_MONTH_UNDER_10000 = 24;

    private double totalPrice;
    private double monthlyPayment;

    public SalesContract(String date, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }
//    Methods will include a constructor and getters and setters for all fields except total
//    price and monthly payment.

//    Monthly payment (if financed) based on:
//        All loans are at 4.25% for 48 months if the price is $10,000 or more
//        Otherwise they are at 5.25% for 24 month
    // if carPrice > $10,000
    // loan = 48 months
    // loanRate = 4.25%

    // if carPrice <= $10,000
    // loan = 24 months
    // loanRate = 5.25%

//    You should provide overrides for getTotalPrice() and getMonthlyPayment() that will
//    return computed values based on the rules above.

//    It is possible that getMonthlyPayment() would return 0 if they chose the NO loan option.

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