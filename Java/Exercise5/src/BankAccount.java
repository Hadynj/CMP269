
public class BankAccount {
    // fields
    private int balance = 1000;

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

    public void withdraw(int amount){
        if (balance >= amount){
            System.out.println();
            balance -= amount;
            System.out.println();

        }
        else{
            System.out.println();
        }
    }

}
