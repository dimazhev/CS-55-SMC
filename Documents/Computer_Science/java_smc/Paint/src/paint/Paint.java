/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author Sharkbait
 */
import java.util.Scanner;
public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int COVERAGE = 350;
        int length, width, height;
        double totalSqFt, paintNeeded;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the room: ");
        length = input.nextInt();
        System.out.print("Please enter the width of the room: ");
        width = input.nextInt();
        System.out.print("Please enter the height of the room: ");
        height = input.nextInt();
        totalSqFt = length * width * height;
        paintNeeded = totalSqFt/COVERAGE;
        System.out.println("The paint needed to cover a room with total square footage " 
            + totalSqFt + " is " + paintNeeded );
        
    }
    
}
