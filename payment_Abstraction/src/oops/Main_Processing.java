package oops;

public class Main_Processing {
	public static void main(String[] args) {
		
		CreditCardPayment credit = new CreditCardPayment();
        PayPalPayment paypal = new PayPalPayment();

        credit.makePayment(1000.0);
        paypal.makePayment(2000.65);
	}

}
