package com.company;

public class bankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber (){
        return accountNumber;
    }
    public void setBalance (int balance){
        this.balance = balance;
    }
    public int getBalance (){
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
    public void setPhoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber (){
        return  phoneNumber;
    }
    public void depositFunds (int deposit){
        balance += deposit;
        System.out.println("new balance is " + balance);
    }
    public void withdrawFunds (int withdraw){
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
