package DesignPatterns.FacadePattern;

public class GooglePay implements Upi{
    @Override
    public void pay() {
       System.out.println("Paying through GooglePay");
    }
}
