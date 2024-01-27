package Online_Banking_System;

import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Bank mainBank = new Bank("name of the bank") ;
        /*l'appel ykoun fel fourma adhika*/
        
        
        //create bank accounts (each variable is unique)!!!
        BankAccount Account1 = new BankAccount(1," 1st account ",20.00) ;
        BankAccount Account2 = new BankAccount(2," 2st account ",90.00) ;
        BankAccount Account3 = new BankAccount(3," 3st account ",00.00) ;
        
        //add bank accounts created
        mainBank.addAccount(Account1) ;
        mainBank.addAccount(Account2) ;
        mainBank.addAccount(Account3) ;
        
        //display initial accounts' values
        System.out.println("Here are the initial values") ;
        mainBank.displayAllAccounts() ;
        System.out.println();/*to print the display method in main*/

        //user gets an account by his choice
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("choose your account number.");
        int userAccNum = scanner.nextInt() ;
        BankAccount theAccountOfTheUserNum = mainBank.getAccount(userAccNum);
        
        //user deposits money from his account
        System.out.println("Enter how much you want to deposit");
        double toDeposit = scanner.nextDouble() ;
        theAccountOfTheUserNum.deposit(toDeposit);
        
        //user withdraw money
        System.out.println("Enter how much you want to withdraw.");
        double toWithdraw = scanner.nextDouble() ;
        theAccountOfTheUserNum.withdraw(toWithdraw);
        
        
        //display final accounts' values
        System.out.println("Here are the final values") ;
        mainBank.displayAllAccounts() ;
        System.out.println();/*to print the display method in main*/
    }
    
}
