package dev.jov;

public abstract class Account {

  protected String accountNumber;
  protected double balance;
  protected String ownerName;

  //konstuktor


  public Account() {
  }

  public Account( String accountNumber, String ownerName, double balance) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = balance;
  }

  //Abstract metody

  public abstract double calculateInterest();
  public abstract String getAccountType();

  //Metody
  public void deposit(double amount) {
    if (amount <= 0) {
       System.out.println("Chyba! Zadej částku větší než 0!");
       return;
    }
    balance += amount;
    System.out.println("Vloženo: " + amount + " Kč");
  }

  public boolean withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;
      System.out.println("Vybráno " + amount + " Kč");
      return true;
    }
    System.out.println("Nedostatek prostředků");
    return false;
  }

  //Getter
  public double getBalance(){
    return balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }
}
