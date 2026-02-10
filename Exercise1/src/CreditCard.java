/*
 	3. The Concrete Subclass: CreditCard
		Create a class CreditCard that extends PaymentMethod.
		Additional Field: private double creditLimit
		Requirement: Override processPayment.
		    If the amount exceeds balance + creditLimit,
		    print "Transaction Declined."
		    Otherwise, subtract the amount and
		    increment the totalTransactions static counter.
		Requirement: Use the super keyword to call the parent constructor.

 * */

// Create a class CreditCard that extends PaymentMethod
public abstract class CreditCard extends PaymentMethod{

    // fields
    private double creditLimit;

    // constructor
    public class CreditCard(String accountHolnder, double balance, double creditLimit){
        super(accountHolder, balance);
        this.creditLimit = creditLimit;
    }

    public void processPayment(double amount){
        if(amount > balance + creditLimit){
            System.out.pritnln("Transaction decloned.");
        }
        else{
            balance -= amount;
            totalTransactions++;
        }

    }

    public String getPaymentStatus(){

    }

    public voidvalidAccount(){
        if(creditLimit < 0){
            System.out.println("Invalid credit limit.");
        }
    }

}
