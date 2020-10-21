package pl.pragmatists.pair;

public class fizzBuzz {

  //define constant values
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
  //evaluates the number and returns the output to the string to be appended
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
    return String.valueOf(num);
  }
  
  //check if the number is either fizz,buzz or fizzbuzz
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

  //function to provide the maximum limit of the number and append the result to a modifiable string
  public static String game(int upper_bound) {
    StringBuilder s = new StringBuilder();

    for (int i = 1; i <= upper_bound; i++) {
      s.append(get_value(i)).append('\n');
    }

    return s.toString();
  }
  
 //main method
  public static void main(String[] args)
  {
    fizzBuzz fizzbuzzobj = new fizzBuzz();
    System.out.println(fizzbuzz.game(100));
  }
}


