package pl.pragmatists.pair;

public class fizzBuzz {

  String fizz = "Fizz";
  String buzz = "Buzz";
  String fizzbuzz = "FizzBuzz";

  int fizzNumber = 3;
  int buzzNumber = 5;
  int fizzBuzzNumber = 15;

  public fizzBuzz() {
  }
  
  //constructor overloading
   public fizzBuzz(int fizzNumber, int buzzNumber) {
    this.fizzNumber = fizzNumber;
    this.buzzNumber = buzzNumber;
    this.fizzBuzzNumber = fizzBuzzNumber;
  }
  
  public String get_value(int num) {
    if(isFizzBuzzNumber(num)) 
    {
      return fizzbuzz;
    }
    
    if(isBuzzNumber(num))
    {
      return buzz;
    }
    
    if(isFizzNumber(num))
    {
      return fizz;
    }
    return String.valueOf(i);
  }


