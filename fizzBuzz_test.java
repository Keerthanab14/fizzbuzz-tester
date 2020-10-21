package pl.pragmatists.pair;

public class fizzBuzz {

  public String fizz = "Fizz";
  public String buzz = "Buzz";
  public String fizzbuzz = "FizzBuzz";

  public int fizzNumber = 3;
  public int buzzNumber = 5;
  public int fizzBuzzNumber = 15;

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
  
   private boolean isFizzBuzzNumber(int num)
   {
    return (num % fizzBuzzNumber == 0)?1:0;
   }
  
   private boolean isBuzzNumber(int num) 
   {
    return  (num % buzzNumber == 0)?1:0;
  }

  private boolean isFizzNumber(int num) 
   {
    return  (num % fizzNumber == 0)?1:0;
  }

 
  }

  public static void main(String[] args)
  {
    fizzBuzz fizzbuzzobj = new fizzbuzz();
  }
}


