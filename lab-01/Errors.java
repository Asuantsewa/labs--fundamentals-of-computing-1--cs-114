import java.util.Scanner;
// File:     Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)
public class Errors{

public static void main(String [] args){
  int number = 10;
  int numberSq = 10 * number;
  Scanner scanner = new Scanner(System.in);
  System.out.println(" Enter your name please: ");
  String nameString = scanner.nextLine();

  System.out.println("What is your favourite number? ");
  number = scanner.nextInt();
  int numSq = number * number;
  System.out.println(nameString + "the square of your number is " + numSq );

}
}
//System.out.print ("What is your favorite number? ");
//number = scan.nextInt();
//numSq = number * number;
//System.out.println (Name  ", the square of your number is "
//numSquared);
