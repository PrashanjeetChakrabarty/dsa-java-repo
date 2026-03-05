// QS> Print the Greeting
// A-> HELLO B-> NAMASTE C-> BONJOUR 
// Uing Switch statement
// charAt(0) → takes the first character

import java.util.*;

public class Main15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         char button = sc.next().charAt(0);

        switch(button){
            case 'a':
                System.out.println("HELLO");
                break;

            case 'b':
                System.out.println("NAMASTE");
                break;

            case 'c':
                System.out.println("BONJOUR");
                break;

            default:
                System.out.println("Invalid Button");


        }
    }

}
