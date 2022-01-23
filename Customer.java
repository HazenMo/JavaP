/**
 * The Customer class will be built to hold the customer's data and have a number 
 * of methods that will deal with custoer data.
 */

public class Customer {
    private long customerID;
    private String meterAddress;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Customer(long customerID, String meterAddress, String customerName, String email, long phoneNUmber)
    {
        this.customerID = customerID;
        this.meterAddress = meterAddress;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNUmber;
    }

    public double calculateCost(double kiloWattHours) {
        final double rate = 12.52;
        return (rate * kiloWattHours)/100;
    }

    public String emailMessage(double cost, String billingCycle)
    {
        return String.format("Hello %1$s,\nYour electric bill for %2$s is $%3$.2f.\nWe appreciate your business. Sincerly,\n -Sieze the Power Electric",
            customerName, billingCycle, cost);
    }

    public long getCustomerID()
    {
        return customerID;
    }

    public String getMeterAddress()
    {
        return meterAddress;
    }

    public String getEmail()
    {
        return email;
    }



}
