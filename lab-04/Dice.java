// *****************************************************************************
// Dice.java
//
// Simulates the rolling of a pair of dice.
// *****************************************************************************

import java.util.Random;

public class Dice {
  public static void main(String[] args) {
    Random number = new Random();
    int a = number.nextInt(6) + 1;
    int b = number.nextInt(6) + 1;
    System.out.println("The number from die one is : "+ a);
    System.out.println("The number from die two is: " + b);
    System.out.println("The total of both dies is: " +  (a + b));
  }
}
