// *****************************************************************************
// StudentGrades.java
//
// Prints a table of points students earned in lab work.
// *****************************************************************************

public class StudentGrades {
  public static void main(String[] args) {
 int jTotal = 30 + 15;
 int joeTotal = 43 + 7;
 int wilTotal = 50 + 8;
 int mTotal = 39 + 10;
 int sTotal = 50 + 15;

    System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + //
            "==          Student Points          ==\n" + //
            "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

System.out.println("   ");
System.out.println("NAME       LAB       BONUS       TOTAL");
System.out.println("Jeremy       30        15"       + jTotal);
System.out.println("Joe          43         7"         +joeTotal);
System.out.println("William      50         8"         +wilTotal);
System.out.println("Mary Sue     39        10"      +   mTotal);
System.out.println("Samuel       50        15"         +sTotal);
  }
}
