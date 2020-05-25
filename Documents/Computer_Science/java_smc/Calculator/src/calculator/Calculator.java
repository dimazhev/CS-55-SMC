/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 * Project 1: calculator
 *
 *  This project is a simple and banter filled calculator
 * 
 * @author Dmitriy Zhevelev
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                      
       char choice = 'Y';
       double total;
       Scanner input = new Scanner(System.in);
     do {
       
       System.out.println("Hi, I am really good at math! Put me to the test.");
       System.out.print("Please enter two numbers and then press Enter: ");
      
       double x = input.nextDouble();
       double y = input.nextDouble();
       input.nextLine();
       
       System.out.print("Please enter one of the operations +, -, *, or / and "
               + "press Enter: ");
       char operator = input.next().charAt(0);
       input.nextLine();     

       
       switch(operator)
       {
           case '+': 
               total = x + y;
               System.out.println(x + " + " + y + " = " + total);
               System.out.println("I'm great at addition");
               break;
               
           case '-':
               total = x - y;
               System.out.println(x + " - " + y + " = " + total);
               System.out.println("Im great at subtraction!");
               break;
              
           case '*':
               total = x * y;
               System.out.println(x + " * " + y + " = " + total);
               System.out.println("Im great at multiplication!");
               break;
               
           case '/':
               total = x / y;
               System.out.println(x + " / " + y + " = " + total);
               System.out.println("Im great at division!");
               break;
               
           default:
               System.out.println("I can compute really well, but what you "
                   + "entered is not one of the operations I\n" +"know ...");
            } 
       System.out.print("Play again [Y/N]?: ");
        choice = input.nextLine().charAt(0);
       
      } while (choice == 'y'|| choice == 'Y');
     System.out.println("Bye Bye!");
    }
    
}
