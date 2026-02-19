import java.util.*;

public class Main25{

// QS> Make a menu driven program. 
// The user can enter 2 numbers,either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop. 
// If he/ she scores : Marks >=90 -> print “This is Good” 89 >= Marks >= 60 -> print “This is also Good” 
// 59 >= Marks >= 0 -> print “This is Good as well” Because marks don’t matter but our effort does.
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int choice;

        do{ 
            System.out.println(" Enter 1 to input marks of the student:");
            System.out.println(" Enter 0 to stop");

            choice = sc.nextInt();
            
            if(choice == 1){
                System.out.println(" Enter student marks out of 100");
                int marks = sc.nextInt();
                if(marks >=90){
                    System.out.println("This is good Marks");
                }
                else if (marks >= 60 && marks <= 89){
                    System.out.println("This is also good marks");

                }
                else if (marks >= 0 && marks <= 59){
                    System.out.println("This doesnt means that you cant imporve in future,keep working hard");
                }
                else{
                    System.out.println("Invalid marks entered, please enter marks between 0 and 100");
                }
            }

        }
        while(choice != 0);
        System.out.println("Program stopped. Thank you for using the program.");

        

    }
}