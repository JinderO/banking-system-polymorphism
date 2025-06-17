package dev.jov;

import java.util.ArrayList;

public class Bank {

  private ArrayList<Account> accounts = new ArrayList<>();

//  public Bank(ArrayList<Account> accounts) {
//    this.accounts = new ArrayList<>();
//  }

  //Metody
  public void addAccount(Account account){
    Account acc = findAccount(account.getOwnerName());
    if (acc == null){
      accounts.add(account);
      System.out.println("Účet přidán pro " + account.getOwnerName());
    } else {
      System.out.println("Účet pro " + account.getOwnerName() + " už existuje");
    }
  }

  public Account findAccount(String accountName){
    for (Account account : accounts){
      if (account.getOwnerName().equals(accountName)){
        return account;
      }
    }return null;
  }

  public void printAllAccounts(){
    System.out.println();
    System.out.println("===Seznam všech účtů=== ");
    for (Account account : accounts){
      System.out.println(account.getOwnerName() +" ("+ account.accountNumber+ "): " +
      account.getAccountType()  +
      " - " + account.getBalance() + " Kč");
    }
  }

  public void applyInterestToAll(){
    for (Account account : accounts){
      account.balance += account.calculateInterest();
    }
  }

  public void applyFeesToChargeable(){
    for (Account account : accounts){
      if (account instanceof Chargeable){
        ((Chargeable) account).applyMonthlyFee();
      }
    }
  }

}
