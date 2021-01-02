import java.util.*;

public class Guessing {
    static final Scanner scan = new Scanner(System.in);

    static int entire = 1; //entire is the variable used to restart the ENTIRE loop
    static int incorrect = 1; //incorrect is the variable used to restart the loop if your guess is wrong
    static int Scoreboard = 0; //to measure score

    public static void main(String[] args) {
        while (entire == 1) { 
            incorrect = 1;
            System.out.println("Welcome to the number guessing game! Just a second, we're picking a number between 0-20! \nInput your guess");

            int number = (int)(Math.random() * 21);  // 0 to 20

            while (incorrect == 1) {
                String guess = scan.nextLine();
                int bruhguess = Integer.parseInt(guess);
                if (bruhguess == number) {
                    System.out.println("Wow, you got it! Good job!");
                    restart();
                }
                else {
                    System.out.println("Sorry! Keep trying!"); 
                }
            }
        }
    }

    static void restart() {
        System.out.println("Would you like to play again? Yes or No");

        String answer = scan.nextLine();

        if (answer.toLowerCase().equals("yes")) {
            System.out.println("OK!");
            ++Scoreboard;
            System.out.println("Your score:" + Scoreboard);
        }
        else {
            System.out.println("Goodbye!");
            ++Scoreboard;
            System.out.println("Your score:" + Scoreboard);
            entire = 2;
        }
        incorrect = 2;
    }
}
