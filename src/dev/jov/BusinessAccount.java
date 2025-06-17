package dev.jov;

public class BusinessAccount extends Account implements Chargeable{

  public BusinessAccount(String accountNumber, String ownerName, double balance) {
    super(accountNumber, ownerName, balance);
  }

  @Override
  public double calculateInterest() {
    return balance * 0.01;
  }

  @Override
  public String getAccountType() {
    return "Business Account";
  }


  @Override
  public double calculateFees() {
    double fees = 200.00;
    return fees;
  }

  @Override
  public void applyMonthlyFee() {
    balance -= calculateFees();
    System.out.println("Odečteno " + calculateFees() + " z účtu " + accountNumber);
  }
}
