/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author Dmitriy Zhevelev
 * CS 55 Project 2. A simple rock paper scissors program.
 */

public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          game();
      
    }
    
    // userChoice gets a choice of either rock paper or scissors from the user
    // and returns that char
    public static char userChoice(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter r, p, or s");
        char choice = input.next().charAt(0);
        return choice;
    }
    
    //computerChoice randomly chooses a number from 0-3 exclusive of 3 and
    // corresponds the random number with a choice of rock paper or scissors
    public static char computerChoice(){
      java.util.Random r = new java.util.Random();
      int compChoice = r.nextInt(3);
      if (compChoice == 1)
            return 'r';
      else if (compChoice == 2)
          return 'p';
      else 
          return 's';
        }
    
    // Compares userChoice and computerChoice to determine winner
    public static void determineWinner(char user, char comp){
        if (user == 'r' && comp == 's')
            System.out.println("User Wins! Rock Smashes Scissors!");
        else if (user == 's' && comp == 'r')
            System.out.println("Computer Wins! Rock Smashes Scissors!");
        else if (user == 's' && comp == 'p')
            System.out.println("User Wins! Scissors cut paper!");
        else if (user == 'p' && comp == 's')
            System.out.println("Compiter Wins! Scissors cut paper!");
        else if (user == 'p' && comp == 'r')
            System.out.println("User Wins! Paper covers rock!");
        else if (user == 'r' && comp == 'p')
            System.out.println("Computer Wins! Paper covers rock!");
        else if (user == comp)
            System.out.println("Draw! There is no winner");
        else
            System.out.println("User has enteren an invalid choice!");
    }
    
    // asks user if they want to play again. If Y or y calls game().
    public static boolean playAgain(){
        char answer;
        System.out.println("Do you want to play again? Y or N");
        java.util.Scanner input = new java.util.Scanner(System.in);
        answer = input.next().charAt(0);
        if (answer == 'Y' || answer == 'y'){
            game();
             return true;  
        }
        else return false;     
    }
    
    //Runs the game and asks if you want to play again.
    public static void game(){
        char userCh, compCh;
        userCh = userChoice();
        System.out.println("You choose " + userCh);
        compCh = computerChoice();
        System.out.println("Computer chose " + compCh);
        determineWinner(userCh, compCh);
        playAgain();
    }
}
