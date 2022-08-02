package DesignPatterns.FacadePattern;

public class PhonePe implements Upi{
    @Override
    public void pay() {
        System.out.println("Paying through PhonePe");
    }
}
