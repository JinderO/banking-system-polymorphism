package dev.jov;

public class Main {
  public static void main(String[] args) {

    Bank bank = new Bank();

    bank.addAccount(new SavingsAccount("SAV001","Jan Novák", 10000));
    bank.addAccount(new CheckingAccount("CHK001","Helena Nová", 5000));
    bank.addAccount(new BusinessAccount("BUS001","Josef Krejčí", 50000));

    bank.printAllAccounts();
    bank.applyInterestToAll();
    bank.applyFeesToChargeable();
    bank.printAllAccounts();

  }
}
