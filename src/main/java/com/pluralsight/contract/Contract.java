package com.pluralsight.contract;

public abstract class Contract
{
    private String date;
    private String customerName;
    private String customerEmail;
    private String vehicleSold;


    public Contract(String date, String customerName, String customerEmail,
                    String vehicleSold, double totalPrice, double monthlyPayment)
    {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public String getVehicleSold()
    {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold)
    {
        this.vehicleSold = vehicleSold;
    }

    // pg. 53
    // now child classes *MUST* override this method
    //    public abstract double getValue();

//    You should define abstract methods for getTotalPrice() and
//    getMonthlyPayment() that will return computed values based on contract type.
    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
