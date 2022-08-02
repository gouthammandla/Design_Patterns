package DesignPatterns.FacadePattern;

public class UpiProvider {
    private Upi googlePay;
    private Upi PhonePe;
    private Upi paytm;

    public UpiProvider() {
        googlePay = new GooglePay();
        PhonePe = new PhonePe();
        paytm = new Paytm();
    }

    public void payThroughGooglePay() {
        googlePay.pay();
    }
    public void payThroughPhonePe() {
        PhonePe.pay();
    }
    public void payThroughPaytm() {
        paytm.pay();
    }
}
