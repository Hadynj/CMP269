/*
    2. The Abstract Class: PaymentMethod
    Create an abstract class named PaymentMethod that implements Payable.
        Fields: * protected String accountHolder
            protected double balance
        Constructor: Initialize both fields.
        Static Member: Add a static int totalTransactions to keep track of how many payments have been processed across the entire system.
    Abstract Method: abstract void validateAccount();

* */
public abstract class PaymentMethod implements Payable{

    // fields
    protected String accountHolder;
    protected double balance;

    // constructor: initialize both fields;
    public PaymentMethod(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Static Member: Add a static int totalTransactions
    protected  static  int totalTransactions = 0;

    // Abstract Method: abstract void validateAccount();
    public abstract  void validateAccount();
}

