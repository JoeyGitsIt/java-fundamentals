package com.joey.takehome;

public class Order {
  String customerName;
  double total;

  public Order(String customerName, double total) {
    this.customerName = customerName;
    this.total = total * 1.085;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public double getTotal() {
    return total;
  }
}
