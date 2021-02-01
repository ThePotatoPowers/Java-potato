import java.util.*;
public class Randomtest {

    static int entire = 1; //entire is the variable used to restart the ENTIRE loop
    static int incorrect = 1; //incorrect is the variable used to restart the loop if your guess is wrong
    static int Scoreboard = 0; //to measure score
    static Scanner input = new Scanner(System.in); //input used for entire code

    public static void main(String[] args) {
    System.out.println("Welcome to the number guessing game! Let's play!");
    
    while (entire == 1) { 
        System.out.println("Input your guess");
        int number = (int)(Math.random() * 20);  // 0 to 20
        incorrect = 1;

        while (incorrect == 1) {
            String guess = input.nextLine();
            int test = Integer.parseInt(guess);

            if (test == number) {
            System.out.println("Wow, you got it!");
            restart();
            }

            else {
            System.out.println("Not quite! Keep going though");
            }

    
            } //ends incorrect loop

        }//ends entire  loop 
        
    
    }//ends main  

static void restart() {
    System.out.println("Would you like to play again? Yes or No");

    String answer = input.nextLine();

    if (answer.toLowerCase().equals("yes")) {
        System.out.println("OK!");
        ++Scoreboard;
        System.out.println("Your score:" + Scoreboard);    
    }//ends if statement
    else {
        System.out.println("Goodbye!");
        ++Scoreboard;
        System.out.println("Your score:" + Scoreboard);
        entire = 2;
        }//ends else statment
    incorrect = 2;
    } //ends restart function
    

} //ends all code





