/*
    1. The Interface: Payable
        Create an interface named Payable that defines the "contract" for any payment method.
        Method: void processPayment(double amount)
        Method: String getPaymentStatus()
*/

public interface Payable {
	void processPayment(double amount);
    String getPaymentStatus();

}
