package com.zacheryirvin.piggybank;

public class Nickel extends Money {

  public Nickel(int numberAdded) {
    super(numberAdded);
    this.value = 0.05;
  } 

  public Nickel() {
    super();
    this.value = 0.05;
  } 

}
