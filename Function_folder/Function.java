package Function_folder;
import java.util.* ;


//          Print the Function
// Syntax: return_type function_name (type arg1, type arg2, ...){
//              // operations
//              return value;
//          }

// Print a given name in a function

public class Function{

    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name); // calling Function
    }
}

// What happens in memory
// stored in stack form
// main() -> printMyName() -> return to main() -> end of program
// 
