import java.util.Scanner; //import input utility
public class ACPlayGames {
    public static void main(String...args) {
    int a = 1;
        while (a == 1) {
        System.out.println("Happy birthday! How old are you turning today?");
        Scanner x = new Scanner(System.in);
        String y;
        y =  x.nextLine();
        int z = Integer.valueOf(y);
        System.out.println("Yo what's up, I'm turning".concat(" ") + z + (" ").concat("years old today"));

        } 
        
        
    }
    
}
