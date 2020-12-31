import java.util.Scanner; //import input utility
import java.util.Arrays; // import array utility
public class Hi { 
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String carstring = Arrays.toString(cars); /* This converts the array cars into a string which can be fully printed.
        The strings strNew and finalCar are the list of cars but with the brackets removed
        */
        String strNew = carstring.replace("[", ""); 
        String finalcar = strNew.replace("]", " ");
        System.out.println("Hello, what kind of car would you like to purchase? Your options include a " + finalcar);
        Scanner x = new Scanner(System.in); 
        String y;
        y =  x.nextLine();
        x.close();
        boolean acplaygames = false;
        
        for (String h : cars) { //this loops through each value of the cars array and sets it to h. If the input (y) is equal to any of the values "h", then the expression returns true
            if (y.equals(h)) { 
            acplaygames = true; } 

        }

        if (acplaygames)  { //If the expression is true the car gets "sold" Elsewise, the vendor replies that the car is not in stock.
        System.out.println("A " + y + "? Sure! One " + y + " coming up!");}

    
        else {
            System.out.println("Sorry! We don't have a " + y + " in stock!");
        }  

    }
}
