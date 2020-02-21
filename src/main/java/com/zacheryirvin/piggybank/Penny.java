package com.zacheryirvin.piggybank;

public class Penny extends Money {

  public Penny(int numberAdded) {
    super(numberAdded);
    this.value = 0.01;
  } 

  public Penny() {
    super();
  } 

}
