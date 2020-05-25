/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sharkbait
 */
import java.util.Scanner; //Scanner is in the java.util package
public class ComputeAreaWithConsoleInput {
      public static void main(String[] args){
      // creating a Scanner object
          Scanner input = new Scanner(System.in);
          
      //prompt the user to enter a radius
          System.out.print("Enter a number for radius: ");
          double radius = input.nextDouble();
          
          //Compute area
          double area = radius * radius * 3.14159;
        
          // display result
          System.out.println("The are of a circle with radius " + radius + " is " + area);
}
}