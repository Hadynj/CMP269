/*
  4. The Concrete Subclass: MealPlan
		Create a class MealPlan that extends PaymentMethod.
		Requirement: Override validateAccount. 
			Meal plan balances cannot be negative.
		Requirement: Implement processPayment specifically for 
				meal plan logic (e.g., only allowing payments 
				if the balance is sufficient).

 * */
// constructor
public abstract class MealPlan extends PaymentMethod {

    public MealPlan(String accountHolder, double balance) {
        super(accountHolder, balance);

    }

    //
    @Override
    public void validateAccount() {
        if (balance < 0) {
            throw new IllegalArgumentException("Meal plan cannot be less " +
                    "the balance")
        }
    }

    //
    public void processPayment(double amount) {
        valideAccount();

        if (amount <= balance) {
            balance -= amount;
            totalTransactions +;
            System.out.println("Payment is approoved for " +
                    accountHolder + ". Remaining balance is: $"
                    + balance);
        } else {
            System.out.println("Insufficient meal plan.");
        }
    }
}


