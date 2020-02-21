package com.zacheryirvin.piggybank;

import java.util.Date;

public abstract class Money {
  private Date id;
  protected double value;
  private int numberAdded;

  public Money(int numberAdded) {
    this.id = new Date();
    this.numberAdded = numberAdded;
  } 

  public Money() {
    this.id = new Date();
    this.numberAdded = 1;
  } 

  public double getValue() {
    return this.value;
  }

  public int getNumberAdded() {
    return this.numberAdded;
  }

  public Date getid() {
    return this.id;
  }

  public double getTotal() {
    return this.value * this.numberAdded;
  }
}
