// QS> Print the Greeting
// A-> HELLO B-> NAMASTE C-> BONJOUR 
// Uing Switch statement

import java.util.*;

public class Main14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("HELLO");
                break;

            case 2:
                System.out.println("NAMASTE");
                break;

            case 3:
                System.out.println("BONJOUR");
                break;

            default:
                System.out.println("Invalid Button");


        }
    }

}
