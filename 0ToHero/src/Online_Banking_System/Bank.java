package Online_Banking_System;

import java.util.*;

public class Bank {
    private String bankName ;
    List<BankAccount> accounts = new ArrayList<>();
    
    public Bank(String bankName){
        this.bankName = bankName ;
   
    }
    public String getBankName(){
        return bankName;
        
    }
    public void setBankName(String bankName){
        this.bankName = bankName ;
        
    }
    public void addAccount(BankAccount account){
        if (!accounts.contains(account)){
            accounts.add(account) ;
            System.out.println("Account added successfully");    
        }else{
        System.out.println("Account already exists");
        }

    }
    //we need the account not his number
    public BankAccount getAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found");
        return null;
    
    }
    public void displayAllAccounts(){
        System.out.println("All accounts are");
        for (BankAccount BA : accounts){
            System.out.println("The account number " + BA.getAccountNumber() + " hold by " + BA.getAccountHolderName() + " has " + BA.getBalance() + " balance ") ;
        }

    }
   
}
