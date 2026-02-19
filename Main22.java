import java.util.*;

// QS. Print the numbers from 0 - 10

public class Main22{
    public static void main(String[] args){
        // Loops (for, while, do-while)
        // do while loop 
        // increment operator = { counter++ } = { counter = counter + 1 }

        int i = 12;
        while ( i<11) {
            System.out.println("Duhai");
        }
        // why is happening ( Duhai not printed )
        // Since while checks the condition before entering,the loop never runs even once.That’s why "Duhai" is NOT printed.

        do{
            System.out.println("Guldhar");
        } 
        while(i<12);

        // why this is happening ( Guldhar printed once )
        // i = 12 do-while runs the block first Prints "Guldhar" once Then checks condition: 12 < 12 → X | false Loop stop That’s why "Guldhar" prints once
        

        // IMPORTANT

        // do while loop is used when we want to execute the block of code ATLEAST ONCE, 
        // regardless of the condition. It guarantees that the code inside the loop will run at least one time, 
        // even if the condition is false from the beginning.


    }
}