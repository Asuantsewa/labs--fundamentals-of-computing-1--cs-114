// *****************************************************************************
// File: Paint.java
//
// Purpose: Determine how much paint is needed to paint the walls of a room
// given its length, width, and height
// *****************************************************************************
import java.util.Scanner;

public class Paint {
  public static void main(String[] args) {
    final int COVERAGE = 350;  //paint covers 350 sq ft/gal
    int door = 20;
    int window = 15;
    Scanner  scan = new Scanner(System.in);
    System.out.println("How many Doors are in the room?: ");
    int numberOfDoors = scan.nextInt();
    System.out.println("How many Windows are in the room?: ");
    int numberOfWindows = scan.nextInt();
    int sizeToTakeOut = ((door * numberOfDoors) + (window * numberOfWindows));

      // Declare integers length, width, and height
      int width = 12;
      int length = 12;
      int height = 30;
      // Declare double totalSqFt;
      double totalSqFt = ((length * width * 4) + height);
      // Declare double paintNeeded;
      double paintNeeded = (totalSqFt / COVERAGE);
      // Declare and initialize a Scanner object.
      Scanner scanner = new Scanner(System.in);
      // Prompt for and read in the length of the room
      System.out.println("What is the length of the room: ");
      int length2 = scan.nextInt();
      // Prompt for and read in the width of the room
      System.out.println("What is the width of the room: ");
      int width2 = scan.nextInt();
      // Prompt for and read in the height of the room
      System.out.println("What is the height of the room: ");
      int height2 = scan.nextInt();
      // Compute the total square feet to be painted — think
      // about the dimensions of each wall.
      int spaceToPaint = ( ((length2 * width2) * 4) + height2);
      // Compute the amount of paint needed.
      float paintNeeded2 = (spaceToPaint - sizeToTakeOut);
      // Print the length, width, and height of the room and the
      // number of gallons of paint needed.
      System.out.println("Length of room: " + length2);
      System.out.println("Width of room: " + width2);
      System.out.println("Height of room: " + height2);
      System.out.println("Number of gallons of paint needed: " + paintNeeded2/350);

      scanner.close();
  }
}
