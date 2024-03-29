package edu.designpatterns.behavioral.strategy;

public class Customer {

  public void makeBankAccountPayment(int amount) {
    System.out.println("Payment of $" + amount + " made from bank account.");
  }

  public void makePayPalPayment(int amount) {
    System.out.println("Payment of $" + amount + " made from PayPal.");
  }

  public void makePayment(Account account, int amount) {
    account.makePayment(amount);
  }


}
