package DesignPatterns.FacadePattern;

public class Main {
    public static void main(String[] args) {
        UpiProvider upiProvider = new UpiProvider();
        upiProvider.payThroughGooglePay();
        upiProvider.payThroughPhonePe();
        upiProvider.payThroughPaytm();
    }
}
