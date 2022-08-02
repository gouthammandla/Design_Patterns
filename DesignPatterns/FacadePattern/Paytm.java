package DesignPatterns.FacadePattern;

public class Paytm implements Upi{
    @Override
    public void pay() {
        System.out.println("Paying through Paytm");
    }
}
