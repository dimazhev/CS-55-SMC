/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerlab;

/**
 *
 * @author Dmitriy_Zhevelev
 */
import java.util.Scanner;
public class ComputerLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = initializeComputerLab();
      
        final int rows = 4;
      
        Scanner sc = new Scanner(System.in);
       int userID, labNumber, stationNumber;
       System.out.println("LAB STATUS \nLab # Computer Station");
        while(true)
        {
            System.out.println("MAIN MENU \n0) Quit\n1)Simulate Login\n2) Simulate Logoff\n3)Search");
            int choice = sc.nextInt();
            if (choice == 0){
                break;
            }
            if (choice == 1){
                System.out.println("Enter the 5 digit ID number of the user logging in: ");
                userID = sc.nextInt();
                System.out.println("Enter the lab number the user is logging in from(1-4:");
                labNumber = sc.nextInt();
                System.out.println("Enter computer station number the user is logging in to (1-6)");
                stationNumber = sc.nextInt();
                array[labNumber - 1][stationNumber - 1] = userID;
                printStation(array, rows);
            }
            else if(choice == 2){
            System.out.println("Enter the 5 digit ID number of the user logging off");
            userID = sc.nextInt();
            int i, j;
             for (i=0; i<rows; i++){
                for (j=0; j < array[i].length;j++){
                    if (array[i][j] == userID){
                        array[i][j]=0;
                    }
         
           
            }
          }
              printStation(array, rows);
        }
            else if(choice == 3){
             System.out.println("Enter the 5 digit number of the user to find");
             userID = sc.nextInt();
             int find = search(array, rows, userID);
      }     
    }
    }    
    
            
   private static int[][] initializeComputerLab(){
    int[][] labData = {{0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0},{0,0,0}};
    return labData;
}
   private static int search(int[][] array, int rows, int userID){
       int i, j;
       for (i=0; i<rows; i++){
           for (j=0; j < array[i].length;j++){
               if (array[i][j] == userID){
                   System.out.println("User" + userID + " is logged in to station Number" +(j+1)+ " In Lab number" +(i+1));
                   return 1;
               }
           }
       }
       return 0;
   }
   private static void printStation(int[][] array, int rows){
       int i, j;
       for(i = 0; i < rows; i++){
           System.out.print((i+1) + " ");
           for(j = 0; j<array[i].length; j++)
           {
               if(array[i][j] == 0)
               {
                   System.out.print((j+1) + ": empty ");
               }
               else
               {
                   System.out.print((j+1)+ ": " + array[i][j]+ " ");
               }
            }
           System.out.println("");
           }
       }
   }


