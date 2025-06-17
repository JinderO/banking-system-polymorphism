package dev.jov;

public class SavingsAccount extends Account{

  public SavingsAccount(String accountNumber, String ownerName, double balance) {
    super(accountNumber, ownerName, balance);
  }

  @Override
  public double calculateInterest() {
    return balance * 0.02;
  }

  @Override
  public String getAccountType() {
    return "Savings Account";
  }
}
