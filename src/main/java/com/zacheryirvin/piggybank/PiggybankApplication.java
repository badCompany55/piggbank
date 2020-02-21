package com.zacheryirvin.piggybank;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiggybankApplication {

  public static HashMap<Date, Money> piggybank = new HashMap<>();
  public static void addMoney(Money mon) {
    piggybank.put(mon.getid(), mon);
  }
  public static ArrayList<Money> list() {
    ArrayList<Money> temp = new ArrayList<>();
    for(Date d : piggybank.keySet()) {
      temp.add(piggybank.get(d));
    }
    return temp;
  }

  public static double getTotal() {
    double temp = 0;
    for(Date d : piggybank.keySet()) {
      temp += piggybank.get(d).getTotal();
    }
    return temp;
  }

	public static void main(String[] args) {
		SpringApplication.run(PiggybankApplication.class, args);
	}

}
