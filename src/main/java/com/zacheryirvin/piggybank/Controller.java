package com.zacheryirvin.piggybank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/piggybank")
public class Controller {

  @PutMapping(value="/add/{money}/{amount}")
  public ResponseEntity<?> addMoney(@PathVariable String money, @PathVariable int amount) {
    switch(money) {
      case("dollar"):
        Money cash = new Dollar(amount);
        PiggybankApplication.addMoney(cash);
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
      case("quarter"):
        cash = new Quarter(amount);
        PiggybankApplication.addMoney(cash);
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
      case("dime"):
        cash = new Dime(amount);
        PiggybankApplication.addMoney(cash);
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
      case("nickel"):
        cash = new Nickel(amount);
        PiggybankApplication.addMoney(cash);
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
      case("penny"):
        cash = new Penny(amount);
        PiggybankApplication.addMoney(cash);
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
      default:
        return new ResponseEntity(PiggybankApplication.list(), HttpStatus.OK);
    }
  }

  @GetMapping(value="/balance", produces={"application/json"})
  public ResponseEntity<?> getBalance() {
    return new ResponseEntity(PiggybankApplication.getTotal(), HttpStatus.OK);
  }
}
