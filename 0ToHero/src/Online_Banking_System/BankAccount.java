package Online_Banking_System;


public class BankAccount {
    private int accountNumber ;
    private String accountHolderName ;
    private double balance ;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber ;
        this.accountHolderName = accountHolderName ;
        this.balance = balance ;
        
    }
    public int getAccountNumber(){
        return accountNumber;
        
    }
    public String getAccountHolderName() {
        return accountHolderName;
    
    }
    public double getBalance() {
        return balance;
    
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " has been deposited to balance.");
    
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Sorry, can't withdraw. NOT RICH ENOUGH");
        }
        else{
        balance -= amount ;
        System.out.println(amount + " has been withdrown of balance.");
        }
    }
    public void displayAccountInfo(){
        System.out.println("The account number " + accountNumber + " hold by " + accountHolderName + " has " + balance);
        
    }
}
