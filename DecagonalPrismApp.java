import java.util.Scanner;
/**
   *This program runs the class DecagonalPrism and its methods.
   *
   *Project 04
   *@author Elliott Baker - COMP 1210
   *@version 9/17/2021
   */
 
public class DecagonalPrismApp {
 /**
 *Creates the object ex1 and prints it.
 *
 *@param args Command line arguments - not used
 */
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      String userlabel = "";
      double useredge;
      double userheight;
      
      System.out.println("Enter label, edge, and height"
         + " for a decagonal prism.");
      System.out.print("\tlabel: ");
      userlabel = scan.nextLine();
      System.out.print("\tedge: ");
      useredge = scan.nextDouble();
      
      if (useredge < 0) 
      {
         System.out.println("Error: edge must be non-negative.");
         return;
      }
      
      System.out.print("\theight: ");
      userheight = scan.nextDouble();
      
      if (userheight < 0) 
      {
         System.out.println("Error: height must be non-negative.");
         return;
      }
      
      DecagonalPrism ex1 = new DecagonalPrism(userlabel, useredge, userheight);
      System.out.println(ex1);
     
   }
}