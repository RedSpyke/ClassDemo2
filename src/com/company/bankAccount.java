package com.company;

public class bankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount (int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void displayAccountInfo (){
        System.out.println("Account number " + accountNumber);
        System.out.println("Balance " + balance);
        System.out.println("Customer name " + customerName);
        System.out.println("Customer email address " + email);
        System.out.println("Customer phone number " + phoneNumber);
    }

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber (){
        return accountNumber;
    }
    public void setBalance (int balance){
        this.balance = balance;
    }
    public double getBalance (){
        return balance;
    }
    public void setCustomerName (String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName (){
        return customerName;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail (){
        return email;
    }
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber (){
        return  phoneNumber;
    }
    public void depositFunds (double deposit){
        balance += deposit;
        System.out.println("new balance is " + balance);
    }
    public void withdrawFunds (double withdraw){
        if (balance - withdraw < 0){
            System.out.println("Insufficient funds ");;
        }
        else
        {
            balance -=withdraw;
        }
        System.out.println("new balance is " + balance);
    }
}
